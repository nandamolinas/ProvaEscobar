import java.util.HashMap;

public class AdaptadorTransacoes implements ProcessadorTransacoes {

    private SistemaBancarioLegado legado;

    public AdaptadorTransacoes(SistemaBancarioLegado legado) {
        this.legado = legado;
    }

    @Override
    public Resposta autorizar(String cartao, double valor, String moeda) {

       
        HashMap<String, Object> params = new HashMap<>();
        params.put("numeroCartao", cartao);
        params.put("valor", valor);

        params.put("codigoMoeda", converterMoeda(moeda));

        
        params.put("canalOrigem", "APP_MOBILE");

        
        HashMap<String, Object> respostaLegado = legado.processarTransacao(params);

        
        return converterResposta(respostaLegado);
    }


    private int converterMoeda(String moeda) {
        return switch (moeda.toUpperCase()) {
            case "USD" -> 1;
            case "EUR" -> 2;
            case "BRL" -> 3;
            default -> throw new IllegalArgumentException("Moeda não suportada: " + moeda);
        };
    }

    private Resposta converterResposta(HashMap<String, Object> legado) {
        boolean autorizado = (boolean) legado.get("autorizado");
        String codigo = (String) legado.get("codigoRetorno");
        String mensagem = (String) legado.get("mensagem");

        return new Resposta(autorizado, codigo, mensagem);
    }
}
