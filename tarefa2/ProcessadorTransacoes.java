public interface ProcessadorTransacoes {
    Resposta autorizar(String cartao, double valor, String moeda);
}


