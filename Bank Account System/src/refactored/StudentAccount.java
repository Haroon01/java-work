package refactored;

public class StudentAccount extends BankAccount {
    private Double interest;

    public StudentAccount(String name, String accountNumber, String sortCode, Double balance, Double interest) {
        super(name, accountNumber, sortCode, balance);
        this.interest = interest;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    @Override
    public void withdraw(Double amount) {
        if (getBalance() <= -500){
            System.out.printf("error: you cannot exceed over £500 overdraft");
        }
        super.withdraw(amount);

    }
}
