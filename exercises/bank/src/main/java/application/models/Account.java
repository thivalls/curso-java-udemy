package application.models;

public class Account {
    private Long number;
    private String holder;
    protected double balance;
    private final int tax = 5;

    public Account() {
    }

    public Account(Long number, String holder) {
        this.number = number;
        this.holder = holder;
        this.balance = 0.0;
    }

    public Account(Long number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double value) {
        balance += value;
    }

    public void setInitialDeposit(double value) {
        deposit(value);
    }

    public void withDraw(double value) {
        balance -= value;
        applyTaxToWithdraw();
    }

    public double getBalance() {
        return balance;
    }

    public void applyTaxToWithdraw() {
        balance -= tax;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", name='" + holder + '\'' +
                ", total=" + balance +
                '}';
    }
}
