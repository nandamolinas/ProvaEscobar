public class Main {
    public static void main(String[] args) {

        SistemaBancarioLegado legado = new SistemaBancarioLegado();

        ProcessadorTransacoes processador =
                new AdaptadorTransacoes(legado);

        System.out.println(" Teste 1 ");
        System.out.println(processador.autorizar("5555-4444", 500, "BRL"));

        System.out.println("\n Teste 2");
        System.out.println(processador.autorizar("5555-4444", 2000, "USD"));
    }
}