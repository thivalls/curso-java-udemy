package application.segundo;

import application.primeiro.MinhaLista;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = "C:\\Users\\Thiago.valls\\studies\\udemy\\exercises\\generics\\src\\main\\java\\application\\segundo\\int.txt";

        ListaGenerica listaGenerica = new ListaGenerica();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            String[] item = new String[2];
            while(line != null) {
                String[] fields = line.split(",");
                listaGenerica.adiciona(new Produto(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            System.out.println("Carregando lista");
            listaGenerica.imprimeLista();

            listaGenerica.verificaMaior(listaGenerica.getLista());
            listaGenerica.verificaMenor(listaGenerica.getLista());

        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }

        sc.close();
    }
}
