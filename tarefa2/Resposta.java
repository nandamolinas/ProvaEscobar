public class Resposta {
     private boolean autorizado;
    private String codigoRetorno;
    private String mensagem;

    public Resposta(boolean autorizado, String codigoRetorno, String mensagem) {
        this.autorizado = autorizado;
        this.codigoRetorno = codigoRetorno;
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "Autorizado=" + autorizado + ", Codigo=" + codigoRetorno + ", Mensagem=" + mensagem;
    }
}
