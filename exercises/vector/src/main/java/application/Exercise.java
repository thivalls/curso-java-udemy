package application;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

class Bedroom {
    String number;
    String name;
    String email;

    Bedroom(String number, String name, String email) {
        this.number = number;
        this.name = name;
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

public class Exercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de quartos que serão alocados");
        int n = sc.nextInt();

        Bedroom[] bookeds = new Bedroom[10];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o numero do quarto");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o nome do locatario");
            String name = sc.nextLine();

            System.out.println("Digite o email do locatario");
            String email = sc.nextLine();

            bookeds[number] = new Bedroom(String.valueOf(number), name, email);
        }

        System.out.println("Busy rooms");
        for (Bedroom bedroom : bookeds) {
            if(bedroom != null) System.out.println(bedroom.number + ": " + bedroom.getName() + ", " + bedroom.getEmail());
        }


        sc.close();
    }
}
