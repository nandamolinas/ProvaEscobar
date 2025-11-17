public class RiskProcessador {
    private RiskStrategy strategy;

    public void setStrategy(RiskStrategy strategy) {
        this.strategy = strategy;
    }

    public String processarCalculo(RiskContext contexto) {
        return strategy.calcularRisco(contexto);
    }
}
