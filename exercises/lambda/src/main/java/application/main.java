package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("TV", 900.00));
        products.add(new Product("Controle", 901.00));
        products.add(new Product("Antena", 1250.00));

        // Collections.sort(products);
        // products.sort(new MyComparator());

//        Comparator<Product> comp = new Comparator<Product>() {
//            @Override
//            public int compare(Product product1, Product product2) {
//                return product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase());
//            }
//        };

//        Comparator<Product> comp = (p1, p2) -> {
//            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//        };

//        Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        products.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));

        for(Product product : products) {
            System.out.println(product.toString());
        }
    }
}
