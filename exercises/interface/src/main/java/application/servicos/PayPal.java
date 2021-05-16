package application.servicos;

import application.modelo.Parcela;

public class PayPal implements ServicoPagamento {

    @Override
    public Double aplicaTaxaJuros(double valorParcela, int numeroParcela) {
        System.out.println("dentro do aplica taxa juros" + " - " + valorParcela + " - " + numeroParcela);
        return valorParcela + ((0.01 * numeroParcela) * valorParcela);
    }

    @Override
    public Double aplicaTaxaPagamento(double valorParcela) {
        return valorParcela + (valorParcela * 0.02);
    }
}
