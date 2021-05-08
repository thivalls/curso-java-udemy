package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o número de posições a ser armazenado");
        int n = sc.nextInt();
        double[] values = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o valor " + (i + 1));
            sc.nextLine();
            values[i] = sc.nextDouble();
        }


        double average = 0.0;
        for (var i = 0; i < n; i++) {
            average += values[i];
        }

        System.out.printf( "O valor da média das alturas é: %.2f", average/n );

        sc.close();
    }
}
