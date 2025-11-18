public class ValidadorCertificado extends ValidadorBase {
    @Override
    protected boolean validarDocumento(NFe documento) {
        System.out.println("Validando certificado digital...");
        return true;
    }
}