package old;

import java.text.NumberFormat;
import java.util.Locale;

public class YoungSaverAccount {
    private String name;
    private String accountNumber;
    private String sortCode;
    private Double balance;
    private Double interest;

    public YoungSaverAccount(String name, String accountNumber, String sortCode, Double balance, Double interest) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.balance = balance;
        this.interest = interest;
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

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public void deposit(Double amount) {
        Locale locale = new Locale("en", "GB");
        NumberFormat cf = NumberFormat.getCurrencyInstance(locale);
        if (amount <= 0) {
            System.out.println("Error: You must deposit at least £0.01");
        }
        else if(balance >= 100){
            System.out.println("Error: You cannot have more than £100 balance.");
        }
        else {
            this.balance += amount;
        }
    }

    public void withdraw(Double amount){
        Locale locale = new Locale("en", "GB");
        NumberFormat cf = NumberFormat.getCurrencyInstance(locale);

        if(amount<=0){
            System.out.println("Error: You cannot withdraw less than £0.01");
        }
        else{
            this.balance -= amount;
        }
    }



}
