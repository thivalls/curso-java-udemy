package application;

import application.models.Account;
import application.models.BusinessAccount;
import application.models.SavingsAccount;

import java.util.Locale;
import java.util.Scanner;

public class MainSavingsAccount {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account accountDefault = new Account(1L, "Thiago", 1000.0);
        Account accountSavings = new SavingsAccount(1L, "Thiago", 1000.0);

        accountDefault.deposit(2000);
        accountSavings.deposit(2000);

        System.out.println("Saldo na conta default antes do saque");
        System.out.println(accountDefault.getBalance());
        System.out.println("Saldo na conta poupança antes do saque");
        System.out.println(accountSavings.getBalance());

        accountDefault.withDraw(500);
        accountSavings.withDraw(500);

        System.out.println("Saldo na conta default depois do saque");
        System.out.println(accountDefault.getBalance());
        System.out.println("Saldo na conta poupança depois do saque");
        System.out.println(accountSavings.getBalance());

        sc.close();
    }
}
