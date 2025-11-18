import java.util.concurrent.*;

public abstract class ValidadorBase implements Validador {
    protected Validador proximo;
    protected static final int TIMEOUT_SEGUNDOS = 5; 
    protected static int falhas = 0;

    @Override
    public void setProximo(Validador proximo) {
        this.proximo = proximo;
    }

    @Override
    public boolean validar(NFe documento) throws Exception {
        if (falhas >= 3) { 
            System.out.println("Circuit breaker ativado. Interrompendo validação.");
            return false;
        }

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Boolean> futuro = executor.submit(() -> validarDocumento(documento));
        boolean resultado = false;

        try {
            resultado = futuro.get(TIMEOUT_SEGUNDOS, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            futuro.cancel(true);
            System.out.println("Timeout no validador: " + this.getClass().getSimpleName());
            resultado = false;
        } catch (Exception e) {
            resultado = false;
        } finally {
            executor.shutdown();
        }

        if (!resultado) falhas++;

        if (resultado && proximo != null) {
            return proximo.validar(documento);
        }

        return resultado;
    }

    protected abstract boolean validarDocumento(NFe documento) throws Exception;

    @Override
    public void rollback(NFe documento) {
    }
}