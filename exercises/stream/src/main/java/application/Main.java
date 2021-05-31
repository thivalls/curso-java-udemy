package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[] inteiros = new Integer[] {1, 2, 3, 4, 5};
        Stream<Integer> str1 = Arrays.stream(inteiros);

        List<Integer> list = Arrays.asList(3,4,5,6,7);
        Stream<Integer> str2 = list.stream();

        Stream<String> str3 = Stream.of("Thiago","Amanda","Theo").map(x -> x + "T");

        Stream<Integer> str4 = Stream.iterate(0, x -> x + 2);

        System.out.println(Arrays.toString(str1.toArray()));
        System.out.println(Arrays.toString(str2.toArray()));
        System.out.println(Arrays.toString(str3.toArray()));
        System.out.println(Arrays.toString(str4.limit(10).toArray()));
    }
}
