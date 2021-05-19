package application;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MinhaLista lista = new MinhaLista();

        System.out.println("Digite o número de elementos a ser adicionado a sua lista");
        int loop = sc.nextInt();
        sc.nextLine();

        System.out.println("De que tipo será a sua lista? (I = Inteiros, S = String)");
        String type = sc.nextLine();

        if(type.equals("i") || type.equals("I")) {
            for (int i = 0; i < loop; i++) {
                System.out.println("Digite um valor inteiro");
                int number = sc.nextInt();
                lista.adiciona(number);
            }
        } else {
            for (int i = 0; i < loop; i++) {
                System.out.println("Digite um valor do tipo string");
                String nome = sc.nextLine();
                lista.adiciona(nome);
            }
        }


        lista.imprimeLista();
        lista.imprimePrimeiro();

        sc.close();
    }
}
