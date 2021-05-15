package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) throws FileNotFoundException {
        File arquivo = new File("/Users/crowel/Documents/java/curso-java-udemy/exercises/file/src/main/java/application/files/in.txt");

        try {
            System.out.println("Iniciando leitura de arquivo");
            Scanner sc = new Scanner(arquivo);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("meu bloco final");
        }

    }

}
