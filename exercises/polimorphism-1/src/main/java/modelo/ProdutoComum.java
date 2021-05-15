package modelo;

public class ProdutoComum extends Produto {
    public ProdutoComum(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String mostraPreco() {
        return this.getNome() + " $" + this.getPreco();
    }
}
