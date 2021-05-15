import modelo.Produto;
import modelo.ProdutoComum;
import modelo.ProdutoImportado;
import modelo.ProdutoUsado;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Produto> produtos = new ArrayList<>();

        System.out.println("informe a quantidade de produtos a serem cadastrados");
        int loop = sc.nextInt();
        sc.nextLine();

        for(int i=0; i < loop; i++) {

            System.out.println("Digite o nome do produto");
            String nome = sc.nextLine();

            System.out.println("Digite o preço do produto");
            double preco = sc.nextDouble();
            sc.nextLine();

            System.out.println("O produto seria comum, usado ou importado?(c, u, i)");
            String response = sc.nextLine();

            if(response.equals("c")) {
                Produto produto = new ProdutoComum(nome, preco);
                produtos.add(produto);
            } else if(response.equals("u")) {
                System.out.println("Digite a data de fabricacao");
                String dataFabricacao = sc.nextLine();
                Produto produto = new ProdutoUsado(nome, preco, dataFabricacao);
                produtos.add(produto);
            } else {
                System.out.println("Digite o valor da taxa de imporacao");
                double taxaImportacao = sc.nextDouble();
                sc.nextLine();
                ProdutoImportado produto = new ProdutoImportado(nome, preco, taxaImportacao);
                produtos.add(produto);
            }
        }

//        products.forEach(produto -> {
//            System.out.println(produto.mostraPreco());
//        });

        System.out.println("Etiquetas de preços:");
        for(Produto produto : produtos) {
            System.out.println(produto.mostraPreco());
        }

        sc.close();
    }
}
