package application.segundo;

import java.util.List;

public class VerificaMaiorMenor {
    public static <T extends Comparable<T>> void maior(List<T> lista) {
        if(lista.isEmpty()) {
            throw new IllegalStateException("A lista não pode ser vazia.");
        }

        T maior = lista.get(0);

        for (T item : lista) {
            if(item.compareTo(maior) > 0) {
                maior = item;
            }
        }

        System.out.println("Maior item da lista: " + maior);
    }

    public static <T extends Comparable<T>> void menor(List<T> lista) {
        if(lista.isEmpty()) {
            throw new IllegalStateException("A lista não pode ser vazia.");
        }

        T menor = lista.get(0);

        for (T item : lista) {
            if(item.compareTo(menor) < 0) {
                menor = item;
            }
        }

        System.out.println("Maior item da lista: " + menor);
    }
}
