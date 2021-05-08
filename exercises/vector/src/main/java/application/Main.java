package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o número de posições a ser armazenado");
        int arrayPositions = sc.nextInt();
        double[] values = new double[arrayPositions];
        System.out.println("Digite o primeiro valor");
        sc.nextLine();

        double value1 = sc.nextDouble();
        values[0] = value1;
        System.out.println("Digite o segundo valor");
        sc.nextLine();

        double value2 = sc.nextDouble();
        values[1] = value2;
        System.out.println("Digite o terceiro valor");
        sc.nextLine();

        double value3 = sc.nextDouble();
        values[2] = value3;

        double average = 0.0;
        for (var i = 0; i < arrayPositions; i++) {
            average += values[i];
        }

        System.out.printf( "O valor da média das alturas é: %.2f", average/arrayPositions );

        sc.close();
    }
}
