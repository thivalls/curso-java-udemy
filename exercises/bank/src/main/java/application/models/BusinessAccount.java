package application.models;

public class BusinessAccount extends Account {
    private static final int LOAN_FEE = 10;
    private Double loanLimit = 1000.00;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Long number, String holder) {
        super(number, holder);
    }

    public BusinessAccount(Long number,
                           String holder,
                           double initialDeposit, Double leanLimit) {
        super(number, holder, initialDeposit);
        this.loanLimit = leanLimit;
    }

    private void increaseLoanLimit(Double $value) {
        loanLimit = $value;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLeanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public Boolean runLoan(Double $value) {
        if ($value < loanLimit) {
            if($value > LOAN_FEE) {
                balance += $value - LOAN_FEE;
            }
            return true;
        } else {
            System.out.println("Este valor ultrapassa o valor de limite para emprestimos");
            return false;
        }
    }
}
