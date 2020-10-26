package refactored;

public class DepositAccount extends BankAccount {
    public DepositAccount(String name, String accountNumber, String sortCode, Double balance) {
        super(name, accountNumber, sortCode, balance);
    }

    private Double interest;

    public DepositAccount(String name, String accountNumber, String sortCode, Double balance, Double interest) {
        super(name, accountNumber, sortCode, balance);
        this.interest = interest;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

}
