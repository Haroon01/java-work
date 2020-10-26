package refactored;

public class CurrentAccount extends BankAccount{

    private Boolean overdraft;

    public CurrentAccount(String name, String accountNumber, String sortCode, Double balance) {
        super(name, accountNumber, sortCode, balance);
    }

    public CurrentAccount(String name, String accountNumber, String sortCode, Double balance, Boolean overdraft) {
        super(name, accountNumber, sortCode, balance);
        this.overdraft = overdraft;
    }

    public Boolean getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(Boolean overdraft) {
        this.overdraft = overdraft;
    }
}
