public class leaguetable {
    public static void main(String[] args) {
        String s;
        String a;
        s = String.format("%s %5s %5s %5s", "Wigan Warriors", "10", "15", "3");
        a = String.format("%s %5s %5s %5s", "Castleford Tigers", "53","53", "7");

        System.out.println(s);
        System.out.println(a);

        for(String listItem : teams.teams){
            System.out.println(listItem);
        }
    }
}
