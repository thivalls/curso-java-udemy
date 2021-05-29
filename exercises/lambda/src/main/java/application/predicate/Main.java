package application.predicate;

import application.comparator.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("TV", 900.00));
        products.add(new Product("Controle", 901.00));
        products.add(new Product("Antena", 1250.00));
        products.add(new Product("Antena1", 10.00));
        products.add(new Product("Antena2", 20.00));

        // products.removeIf(new ProductPredicate());
        // products.removeIf(p -> p.getPrice() <= 100.00);
        // products.removeIf(Product::filtraMenor100Estatico);
        // products.removeIf(Product::filtraMenor100NaoEstatico);

        Predicate<Product> testeFiltraMaior100 = p -> p.getPrice() <= 100.00;
        products.removeIf(testeFiltraMaior100);

        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
}
