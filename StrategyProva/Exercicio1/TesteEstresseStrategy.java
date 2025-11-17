public class TesteEstresseStrategy implements RiskStrategy {
    
    public double calcularRiscoNumerico(RiskContext contexto) {
        return contexto.getExposure() * contexto.getVolatility() * 2.33 * 2.0;
    }
    
    @Override
    public String calcularRisco(RiskContext contexto) {
        double valor = calcularRiscoNumerico(contexto);
        String resultado = "Executando Stress Test: " + valor;
        System.out.println(resultado);
        return resultado;
    }
}