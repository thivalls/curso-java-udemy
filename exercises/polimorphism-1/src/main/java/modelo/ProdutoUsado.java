package modelo;

public class ProdutoUsado extends Produto {

    private String dataFabricacao;

    public ProdutoUsado(String nome, double preco, String dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String mostraPreco() {
        return this.getNome() + " (usado) $ " + this.getPreco();
    }
}
