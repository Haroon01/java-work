import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //   Scanner input
        //Locale locale = new Locale("en", "GB");
        //NumberFormat cf = NumberFormat.getCurrencyInstance(locale);
        CurrentAccount ca = new CurrentAccount("Haroon","4829384","48-37-28",0.0, false);
        System.out.println("Your Current Balance is: "+ca.getBalance());
        System.out.println("\nHi, what would you like to withdraw or deposit? ");


        Scanner input = new Scanner(System.in);
        String usrinput = input.nextLine();
        if(usrinput.equals("withdraw")){
            System.out.print("how much would you like to withdraw? ");
            Double amount = input.nextDouble();
            ca.withdraw(amount);
            System.out.println("Your new balance is:"+ca.getBalance());
        }
        else if(usrinput.equals("deposit")){
            System.out.print("How much would you like to deposit? ");
            Double amount = input.nextDouble();
            ca.deposit(amount);
            System.out.println("Your new balance is: "+ca.getBalance());
        }
        else{
            System.out.println("errror");
        }





    }
}
