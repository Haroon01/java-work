package old;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrentAccount {
    private String name;
    private String accountNumber;
    private String sortCode;
    private Double balance;
    private Boolean overdraft;



    public CurrentAccount(String name, String accountNumber, String sortCode, Double balance, Boolean overdraft) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.balance = balance;
        this.overdraft = overdraft;
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

    public Boolean getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(Boolean overdraft) {
        this.overdraft = overdraft;
    }

    public void deposit(Double amount){
        Locale locale = new Locale("en", "GB");
        NumberFormat cf = NumberFormat.getCurrencyInstance(locale);
        if(amount<=0){
            System.out.println("Error: You must deposit at least £0.01");
        }
        else{
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


/*    public static void old.main(String[] args) {
     //   Scanner input
        Locale locale = new Locale("en", "GB");
        NumberFormat cf = NumberFormat.getCurrencyInstance(locale);
        old.CurrentAccount ca = new old.CurrentAccount("Haroon","4829384","48-37-28",0.0);
        System.out.println("Your Current Balance is: "+cf.format(ca.getBalance()));
        Scanner input = new Scanner(System.in);
        System.out.println("how much would you like to deposit? ");
        Double amount = input.nextDouble();
        ca.deposit(amount);

    }*/

}
