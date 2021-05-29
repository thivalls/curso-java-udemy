package application.function;

import application.comparator.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("TV", 900.00));
        products.add(new Product("Controle", 901.00));
        products.add(new Product("Antena", 1250.00));
        products.add(new Product("Antena1", 10.00));
        products.add(new Product("Antena2", 20.00));

        // List<String> nomes = products.stream().map(new ProductFunction()).collect(Collectors.toList());
        // List<String> nomes = products.stream().map((p) -> p.getName().toUpperCase()).collect(Collectors.toList());
        // List<String> nomes = products.stream().map(Product::toUpperEstatico).collect(Collectors.toList());
        // List<String> nomes = products.stream().map(Product::toUpperNaoEstatico).collect(Collectors.toList());

        Function<Product, String> myFunc = (p) -> p.getName().toUpperCase();
        List<String> nomes = products.stream().map(myFunc).collect(Collectors.toList());

        nomes.forEach(System.out::println);
    }
}
