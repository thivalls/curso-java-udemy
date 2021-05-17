package application.servicos;

public class PayPal implements ServicoPagamento {

    private static final double TAXA_JUROS = 0.01;
    private static final double TAXA_PAGAMENTO = 0.02;

    @Override
    public double aplicaTaxaJuros(double valorParcela, int numeroParcela) {
        return TAXA_JUROS * numeroParcela * valorParcela;
    }

    @Override
    public double aplicaTaxaPagamento(double valorParcela) {
        return valorParcela * TAXA_PAGAMENTO;
    }
}
