package application;

import application.models.BusinessAccount;

import java.util.Locale;
import java.util.Scanner;

public class MainBusiness {
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

        BusinessAccount account = new BusinessAccount(accountNumber, holder);

        if (response.equals("y") || response.equals("Y")) {
            System.out.print("Insira um valor para depósito inicial");
            double initialDeposit = sc.nextDouble();
            account.setInitialDeposit(initialDeposit);
        }


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

        System.out.println("Deseja solicitar um empréstimo? (y/n)");
        String responseLoan = sc.next();
        if (responseLoan.equals("y") || responseLoan.equals("Y")) {
            // Emprestimo
            System.out.println("Insira um valor para empréstimo");
            double loan = sc.nextDouble();
            if(account.runLoan(loan)) {
                System.out.println("Empréstimo aprovado");
            } else {
                System.out.println("Empréstimo reprovado. Entre em contato com seu gerente.");
            }
        }

        System.out.println("Salto total de sua conta");
        System.out.println(account.getBalance());

        sc.close();
    }
}
