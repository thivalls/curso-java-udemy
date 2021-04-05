package staticclass;

public class CurrencyConverter {
    public static double calcCurrency(double quantity, double price, double tax) {
        return applyTax(tax, quantity * price);
    }

    public static double applyTax(double tax, double value) {
        double resultWithTax = value;
        resultWithTax += (value * (tax / 100));
        return resultWithTax;
    }
}
