package application.functionAsParameter;

import application.comparator.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("TV", 900.00));
        products.add(new Product("Controle", 901.00));
        products.add(new Product("Antena", 1250.00));
        products.add(new Product("Antenae", 10.00));
        products.add(new Product("Antena2", 20.00));

        for (Product product: products) {
            System.out.println(product.getName());
        }

        ProductService productService = new ProductService();
        System.out.println("A soma filtrada tem resultado de: "
                + productService.filteredSum(products, p -> p.getName().endsWith("e")));
    }
}
