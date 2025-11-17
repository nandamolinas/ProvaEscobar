package ProvaEscobar;
public class Main {
    public static void main(String[] args) {
        RiskContext contexto = new RiskContext(1_000_000, 0.15, 0.99);
        RiskProcessador processor = new RiskProcessador();

        processor.setStrategy(new ValueAtRiskStrategy());
        System.out.println(processor.processarCalculo(contexto));

        processor.setStrategy(new PerdaEsperadaStrategy());
        System.out.println(processor.processarCalculo(contexto));

        processor.setStrategy(new TesteEstresseStrategy());
        System.out.println(processor.processarCalculo(contexto));
    }
}
//Ele é Strategy porque atende os 4 pilares que definem o padrão Strategy.
