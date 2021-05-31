package application.exec2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String path = "/Users/crowel/Documents/java/curso-java-udemy/exercises/stream/src/main/java/application/exec2/dados.txt";
        Scanner sc = new Scanner(System.in);

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            List<Funcionario> funcionarios = new ArrayList<>();

            while(line != null) {
                String[] fields = line.split(",");
                funcionarios.add(new Funcionario(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.println("Entry salary");
            Double salary = sc.nextDouble();
            List<String> emailsFiltrados = funcionarios
                    .stream()
                    .filter(x -> x.getSalario() > salary)
                    .map(x -> x.getEmail())
                    .sorted((s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase()))
                    .collect(Collectors.toList());
            emailsFiltrados.forEach(System.out::println);
            Double sumSalaries = funcionarios
                    .stream()
                    .filter(x -> x.getName().startsWith("M"))
                    .map(x -> x.getSalario())
                    .reduce(0.0, (x, y) -> x + y);
            System.out.println("Sum of salary of people whose name starts with 'M': " + sumSalaries);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
