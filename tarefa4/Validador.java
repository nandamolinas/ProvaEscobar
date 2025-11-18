public interface Validador {
    boolean validar(NFe documento) throws Exception;
    void rollback(NFe documento);
    void setProximo(Validador proximo);
}