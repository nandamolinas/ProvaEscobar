public class ValueAtRiskStrategy implements RiskStrategy {
    
    public double calcularRiscoNumerico(RiskContext contexto) {
        return contexto.getExposure() * contexto.getVolatility() * 2.33;
    }
    
    @Override
    public String calcularRisco(RiskContext contexto) {
        double valor = calcularRiscoNumerico(contexto);
        String resultado = "Calculando VaR: " + valor;
        System.out.println(resultado);
        return resultado;
    }
}