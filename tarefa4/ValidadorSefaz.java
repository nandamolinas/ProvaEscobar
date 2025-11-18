public class ValidadorSefaz extends ValidadorBase {
    @Override
    protected boolean validarDocumento(NFe documento) {
        System.out.println("Consultando SEFAZ...");
        return true;
    }
}
