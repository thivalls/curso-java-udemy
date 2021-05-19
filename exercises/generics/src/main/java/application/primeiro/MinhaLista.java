package application.primeiro;

import java.util.ArrayList;
import java.util.List;

public class MinhaLista<T> {
    private List<T> lista = new ArrayList<T>();

    public MinhaLista() {

    }

    public List<T> getLista() {
        return lista;
    }

    public void adiciona(T inteiro) {
        this.lista.add(inteiro);
    }

    public void imprimePrimeiro() {
        System.out.println("Primeiro elemento da lista -> " + this.lista.get(0));
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
}
