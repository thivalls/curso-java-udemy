package main;


import java.util.Locale;
import java.util.Scanner;

public class MainExercises {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // exec2(sc);
        // exec3(sc);
        // exec4(sc);
        exec5(sc);
    }

    public static void exec2(Scanner sc) {
        double raio = sc.nextDouble();
        double pi = 3.14159;
        System.out.printf("%.4f", pi * (raio * raio));
    }

    public static void exec3(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println((a*b) - (c*d));
    }

    public static void exec4(Scanner sc) {
        int number = sc.nextInt();
        double hours = sc.nextDouble();
        double valuePerHour = sc.nextDouble();

        System.out.println("NUMBER: " + number);
        System.out.printf("SALARY: %.2f", (hours * valuePerHour));
    }

    public static void exec5(Scanner sc) {
        System.out.println("ID produto 1");
        int productId1 = sc.nextInt();
        System.out.println("Quantidade produto 1");
        int quantity1 = sc.nextInt();
        System.out.println("Preçco produto 1");
        double price1 = sc.nextDouble();

        System.out.println("ID produto 2");
        int productId2 = sc.nextInt();
        System.out.println("Quantidade produto 2");
        int quantity2 = sc.nextInt();
        System.out.println("Preço produto 2");
        double price2 = sc.nextDouble();

        double result = (quantity1 * price1) + (quantity2 * price2);

        System.out.printf("VALOR A PAGAR: %.2f", result);
    }
}
