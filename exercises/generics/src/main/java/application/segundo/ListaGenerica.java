package application.segundo;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

public class ListaGenerica<T> {
    private List<T> lista = new ArrayList<>();
    private T maior;
    int comparable = Integer.MIN_VALUE;
    private T menor;
    int comparableMin = Integer.MAX_VALUE;

    public ListaGenerica() {}

    public void adiciona(T valor) {
        this.lista.add(valor);
    }

    public void imprimeLista() {
        for (int i = 0; i < this.lista.size(); i++) {
            if(i == 0) {
                System.out.print("[ ");
            }

            System.out.print(this.lista.get(i) + " ");

            if(i == (this.lista.size() - 1)) {
                System.out.println("]");
            }
        }
    }

    public List<T> getLista() {
        return lista;
    }

    public <T extends Comparable<? super T>> void verificaMaior(List<T> lista) {
        if(lista.isEmpty()) {
            throw new IllegalStateException("A lista não pode ser vazia.");
        }

        T maior = lista.get(0);

        for (T item : lista) {
            if(item.compareTo(maior) > 0) {
                maior = item;
            }
        }

        System.out.println("Maior preço da lista: " + maior);
    }

    public <T extends Comparable<? super T>> void verificaMenor(List<T> lista) {
        if(lista.isEmpty()) {
            throw new IllegalStateException("A lista não pode ser vazia.");
        }

        T menor = lista.get(0);

        for (T item : lista) {
            if(item.compareTo(menor) < 0) {
                menor = item;
            }
        }

        System.out.println("Menor preço da lista: " + menor);
    }
}
