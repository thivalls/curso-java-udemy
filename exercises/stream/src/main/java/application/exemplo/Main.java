package application.exemplo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[] inteiros = new Integer[] {1, 2, 3, 4, 5};
        Stream<Integer> str1 = Arrays.stream(inteiros);

        List<Integer> list = Arrays.asList(3,4,5,6,7);
        Stream<Integer> str2 = list.stream();

        Stream<String> str3 = Stream.of("Thiago","Amanda","Theo").map(x -> x + "T");

        Stream<Integer> str4 = Stream.iterate(0, x -> x + 2);

        List<Integer> listaInteiros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 22, 45, 12);
        List<Integer> pares = listaInteiros.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        Integer sumListaPares = pares.stream().reduce(0, (x, y) -> x + y);

        System.out.println(Arrays.toString(str1.toArray()));
        System.out.println(Arrays.toString(str2.toArray()));
        System.out.println(Arrays.toString(str3.toArray()));
        System.out.println(Arrays.toString(str4.limit(10).toArray()));
        System.out.println("--------------");
        System.out.println("Lista de inteiros original");
        System.out.println(listaInteiros.toString());
        System.out.println("Lista de inteiros filtrando elementos pares");
        System.out.println(pares.toString());
        System.out.println("Somatório dos elementos pares: " + sumListaPares);
    }
}
