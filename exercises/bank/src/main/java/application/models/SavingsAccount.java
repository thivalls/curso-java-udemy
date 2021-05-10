package application.models;

public class SavingsAccount extends Account {

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Long number, String holder, double initialDeposit) {
        super(number, holder, initialDeposit);
    }


    @Override
    public void withDraw(double value) {
        balance -= value;
    }
}
