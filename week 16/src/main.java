import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //   Scanner input
        Locale locale = new Locale("en", "GB");
        NumberFormat cf = NumberFormat.getCurrencyInstance(locale);
        CurrentAccount ca = new CurrentAccount("Haroon","4829384","48-37-28",0.0);
        System.out.println("Your Current Balance is: "+cf.format(ca.getBalance()));
        Scanner input = new Scanner(System.in);
        System.out.println("how much would you like to deposit? ");
        Double amount = input.nextDouble();
        ca.deposit(amount);

    }
}
