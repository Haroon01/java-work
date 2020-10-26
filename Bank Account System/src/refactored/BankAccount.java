package refactored;

import java.text.NumberFormat;
import java.util.Locale;

abstract class BankAccount {
    private String name;
    private String accountNumber;
    private String sortCode;
    private Double balance;

    public BankAccount(String name, String accountNumber, String sortCode, Double balance) {
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

    public String getBalance() {
        Locale locale = new Locale("en", "GB");
        NumberFormat cf = NumberFormat.getCurrencyInstance(locale);
        return cf.format(balance);
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void deposit(Double amount){
        Locale locale = new Locale("en", "GB");
        NumberFormat cf = NumberFormat.getCurrencyInstance(locale);
        if(amount<0){
            System.out.println("Error: You must deposit at least £0.01");
        }
        else{
            this.balance += amount;
        }

    }

    public void withdraw(Double amount){
        Locale locale = new Locale("en", "GB");
        NumberFormat cf = NumberFormat.getCurrencyInstance(locale);

        if(amount<0){
            System.out.println("Error: You cannot withdraw less than £0.01");
        }
        else{
            this.balance -= amount;
        }
    }

}
