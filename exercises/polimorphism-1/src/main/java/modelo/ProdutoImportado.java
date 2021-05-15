package modelo;

public class ProdutoImportado extends Produto {

    private double taxaImportacao;

    public ProdutoImportado(String nome, double preco, double taxaImportacao) {
        super(nome, preco);
        this.taxaImportacao = taxaImportacao;
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    @Override
    public String mostraPreco() {
        double precoComTaxaImportacao = this.getPreco() + this.getTaxaImportacao();
        return this.getNome() + " $ " + precoComTaxaImportacao + "(Taxa de importação: " + this.getTaxaImportacao() + ")";
    }
}
