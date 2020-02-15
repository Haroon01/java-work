import javax.management.StandardEmitterMBean;
import java.awt.event.ItemEvent;
import java.util.Collections;
import java.util.List;
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
            System.out.print("enter temperature "+i+": ");
            String number = input.nextLine();
            String cleanNumber = removeLastChar(number);
            int intNumber = Integer.parseInt(cleanNumber);
            tempList.add(intNumber);
        }
        //System.out.println(tempList);
        System.out.println("---------Stats----------");
        System.out.println("Max Temperature: "+findMax(tempList)+"C");
        System.out.println("Min Temperature: "+findMin(tempList)+"C");
        System.out.println("Average Temperature: "+findAvg(tempList)+"C");




    }
    // Remove last character from user input
    private static String removeLastChar(String str) {
        return str.substring(0, str.length() - 1);
    }

    public static Integer findMin(ArrayList<Integer> tempList) {

        // check if list empty
        if (tempList == null || tempList.size() == 0) {
            return Integer.MAX_VALUE;
        }

        // Make a new list to sort values from tempList
        ArrayList<Integer> sortedList = new ArrayList<>(tempList);
        Collections.sort(sortedList);
        // Get first value from new sortedList
        return sortedList.get(0);
    }

    public static Integer findMax(ArrayList<Integer> tempList){

        if (tempList == null || tempList.size() == 0){
            return Integer.MAX_VALUE;

        }

        ArrayList<Integer> sortedList = new ArrayList<>(tempList);
        Collections.sort(sortedList);
        // get final value from sortedList
        return sortedList.get(sortedList.size() - 1);
    }

    public static Integer findAvg(ArrayList<Integer> tempList){

        ArrayList<Float> doubleList = new ArrayList(tempList);

        Integer sum = 0;
        for(int i=0; i<tempList.size(); i++){
            sum = sum + tempList.get(i);
        }
       // Integer avg = (tempList.size() / sum);
        return (sum / tempList.size());
    }
}

// array list tutorial https://dzone.com/articles/how-to-create-an-array-list-in-java-with-example
