package application;

import application.models.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Número da conta");
        Long accountNumber = (long) sc.nextInt();
        System.out.println("Digite seu nome");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Possui um valor inicial para depósito? (y/n)");
        String response = sc.next();

        if (response.equals("y") || response.equals("Y")) {
            System.out.print("Insira um valor para depósito inicial");
            double initialDeposit = sc.nextDouble();
            Account account = new Account(accountNumber, holder, initialDeposit);

            // Deposito
            System.out.print("Insira um valor para depósito ");
            double deposito = sc.nextDouble();
            account.deposit(deposito);
            System.out.println(account);

            // Saque
            System.out.println("Insira um valor para saque");
            double saque = sc.nextDouble();
            account.withDraw(saque);
            System.out.println(account);
        } else {
            Account account = new Account(accountNumber, holder);
            // Deposito
            System.out.print("Insira um valor para depósito ");
            double deposito = sc.nextDouble();
            account.deposit(deposito);
            System.out.println(account);

            // Saque
            System.out.println("Insira um valor para saque");
            double saque = sc.nextDouble();
            account.withDraw(saque);
            System.out.println(account);
        }

        sc.close();
    }
}
