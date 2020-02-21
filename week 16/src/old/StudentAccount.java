package old;

public class StudentAccount {
    private String name;
    private String accountNumber;
    private String sortCode;
    private Double balance;
    private static Double interest;

    public StudentAccount(String name, String accountNumber, String sortCode, Double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public static Double getInterest() {
        return interest;
    }

    public static void setInterest(Double interest) {
        StudentAccount.interest = interest;
    }
}
