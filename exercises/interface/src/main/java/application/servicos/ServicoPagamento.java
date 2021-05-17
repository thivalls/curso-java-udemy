package application.servicos;

import application.modelo.Parcela;

public interface ServicoPagamento {
    double aplicaTaxaJuros(double valorParcela, int numeroParcela);
    double aplicaTaxaPagamento(double valorParcela);
}
