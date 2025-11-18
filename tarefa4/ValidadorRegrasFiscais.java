public class ValidadorRegrasFiscais extends ValidadorBase {
    @Override
    protected boolean validarDocumento(NFe documento) {
        System.out.println("Validando regras fiscais...");
        return true;
    }
}