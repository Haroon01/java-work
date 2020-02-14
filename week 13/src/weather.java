import java.util.Scanner;
import java.util.ArrayList;

public class weather {
    private int temp;


    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public static void main(String[] args) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);

        for (int i=1; i<=5; i++) {
            System.out.println("enter temperature "+i+": ");
            int number = input.nextInt();
            tempList.add(number);
        }

        System.out.println(tempList);

    }
}

// array list tutorial https://dzone.com/articles/how-to-create-an-array-list-in-java-with-example