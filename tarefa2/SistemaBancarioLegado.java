import java.util.HashMap;

public class SistemaBancarioLegado {

    public HashMap<String, Object> processarTransacao(HashMap<String, Object> parametros) {

        HashMap<String, Object> resposta = new HashMap<>();

       
        if((double) parametros.get("valor") <= 1000) {
            resposta.put("autorizado", true);
            resposta.put("codigoRetorno", "00");
            resposta.put("mensagem", "Transacao aprovada no sistema legado");
        } else {
            resposta.put("autorizado", false);
            resposta.put("codigoRetorno", "51");
            resposta.put("mensagem", "Saldo insuficiente no sistema legado");
        }

        return resposta;
    }
}
