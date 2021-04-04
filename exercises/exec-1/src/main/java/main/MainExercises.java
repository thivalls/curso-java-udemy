package main;


import java.util.Locale;
import java.util.Scanner;

public class MainExercises {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        System.out.printf("%.4f", calcArea(raio));
    }

    public static double calcArea(double raio) {
        double pi = 3.14159;
        return pi * (raio * raio);
    }
}
