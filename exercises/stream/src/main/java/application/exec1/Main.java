package application.exec1;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String path = "/Users/crowel/Documents/java/curso-java-udemy/exercises/stream/src/main/java/application/exec1/dados.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            List<Product> products = new ArrayList<>();

            while(line != null) {
                String[] fields = line.split(",");
                products.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            for (Product product : products) {
                System.out.println(product.toString());
            }

            Double avg = products.stream().map(x -> x.getPrice()).reduce(0.0, (x, y) -> x + y) / products.size();
            System.out.println("Preço médio dos produtos: " + String.format("%.2f", avg));
            System.out.println("Lista de produtos com preço abaixo da média");

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> listaProdutosAbaixoMedia = products.stream()
                    .filter(x -> x.getPrice() < avg)
                    .map(x -> x.getName())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());
            for (String name : listaProdutosAbaixoMedia) {
                System.out.println(name);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
