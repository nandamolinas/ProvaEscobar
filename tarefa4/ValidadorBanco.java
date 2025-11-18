public class ValidadorBanco extends ValidadorBase {
    @Override
    protected boolean validarDocumento(NFe documento) {
        System.out.println("Validando duplicidade no banco...");
        documento.setId(123L);
        return true;
    }

    @Override
    public void rollback(NFe documento) {
        System.out.println("Rollback: removendo registro do banco para NFe " + documento.getId());
        documento.setId(null);
    }
}
