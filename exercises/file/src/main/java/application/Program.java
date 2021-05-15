package application;

import java.io.*;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws FileNotFoundException {

        String[] linhasParaEscreverNoArquivo = new String[] {"Thiago", "Amanda", "Theo", "Bete"};
        String path = "/Users/crowel/Documents/java/curso-java-udemy/exercises/file/src/main/java/application/files/out.txt";


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String linha : linhasParaEscreverNoArquivo) {
                bw.write(linha);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
