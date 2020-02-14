import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrentAccount {
    private String name;
    private String accountNumber;
    private String sortCode;
    private Double balance;



    public CurrentAccount(String name, String accountNumber, String sortCode, Double balance) {
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

    public void deposit(Double amount){
        Locale locale = new Locale("en", "GB");
        NumberFormat cf = NumberFormat.getCurrencyInstance(locale);
        this.balance += amount;
        System.out.println("Your new balance is: "+cf.format(getBalance()));
    }


/*    public static void main(String[] args) {
     //   Scanner input
        Locale locale = new Locale("en", "GB");
        NumberFormat cf = NumberFormat.getCurrencyInstance(locale);
        CurrentAccount ca = new CurrentAccount("Haroon","4829384","48-37-28",0.0);
        System.out.println("Your Current Balance is: "+cf.format(ca.getBalance()));
        Scanner input = new Scanner(System.in);
        System.out.println("how much would you like to deposit? ");
        Double amount = input.nextDouble();
        ca.deposit(amount);

    }*/

}
