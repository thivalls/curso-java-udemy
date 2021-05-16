package application.servicos;

import application.modelo.Parcela;

public interface ServicoPagamento {
    public Double aplicaTaxaJuros(double valorParcela, int numeroParcela);
    public Double aplicaTaxaPagamento(double valorParcela);
}
