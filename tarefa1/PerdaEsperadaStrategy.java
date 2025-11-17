package ProvaEscobar;
public class PerdaEsperadaStrategy implements RiskStrategy {
    
    public double calcularRiscoNumerico(RiskContext contexto) {
        double var = contexto.getExposure() * contexto.getVolatility() * 2.33;
        double ajusteCauda = var * 0.15;
        return var + ajusteCauda;
    }
    
    @Override
    public String calcularRisco(RiskContext contexto) {
        double valor = calcularRiscoNumerico(contexto);
        String resultado = "Calculando Perda Esperada: " + valor;
        System.out.println(resultado);
        return resultado;
    }
}
