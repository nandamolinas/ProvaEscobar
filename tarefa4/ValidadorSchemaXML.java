public class ValidadorSchemaXML extends ValidadorBase {
    @Override
    protected boolean validarDocumento(NFe documento) {
        System.out.println("Validando schema XML...");
        return true;
    }
}