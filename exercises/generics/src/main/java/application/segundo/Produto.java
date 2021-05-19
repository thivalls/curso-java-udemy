package application.segundo;

public class Produto implements Comparable<Produto> {
    private String produto;
    private Double preco;

    public Produto(String produto, Double preco) {
        this.produto = produto;
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Produto o) {
        return preco.compareTo(o.getPreco());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "produto='" + produto + '\'' +
                ", preco=" + preco +
                '}';
    }
}
