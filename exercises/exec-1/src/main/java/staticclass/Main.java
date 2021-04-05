package staticclass;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("How much the dollar is?");
        double price = sc.nextDouble();
        System.out.println("How much dollar have you bought?");
        double quantity = sc.nextDouble();
        System.out.println("How much is the fee");
        double tax = sc.nextDouble();

        double totalToPay = CurrencyConverter.calcCurrency(quantity, price, tax);

        System.out.printf("Amount to be paid in reais is = %.2f", totalToPay);
        sc.close();
    }
}
