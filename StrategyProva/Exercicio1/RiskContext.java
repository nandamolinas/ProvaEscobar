public class RiskContext {
    private double exposure;
    private double volatility;
    private double confidenceLevel;

    public RiskContext(double exposure, double volatility, double confidenceLevel) {
        this.exposure = exposure;
        this.volatility = volatility;
        this.confidenceLevel = confidenceLevel;
    }

    public double getExposure() { return exposure; }
    public double getVolatility() { return volatility; }
    public double getConfidenceLevel() { return confidenceLevel; }
}