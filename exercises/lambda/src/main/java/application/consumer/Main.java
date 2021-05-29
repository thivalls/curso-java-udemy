package application.consumer;

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

        // products.forEach(new ProductConsumer());
        // products.forEach(produto -> produto.setPrice(produto.getPrice() * 2));
        // products.forEach(Product::multiplicaPor3Estatico);
        products.forEach(Product::multiplicaPor3NaoEstatico);

        products.forEach(System.out::println);
    }
}
