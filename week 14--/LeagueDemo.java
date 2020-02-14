package league;

public class LeagueDemo {

    public static void main (String[] args) {

        SuperLeague sl = new SuperLeague ();

        RugbyTeam hudds = new RugbyTeam ("Huddersfield Giants");
        RugbyTeam hullf = new RugbyTeam ("Hull FC");
        RugbyTeam leeds = new RugbyTeam ("Leeds Rhinos");
        RugbyTeam wigan = new RugbyTeam ("Wigan Warriors");

        sl.addTeam (hudds);
        sl.addTeam (hullf);
        sl.addTeam (leeds);
        sl.addTeam (wigan);

        hudds.playMatch (12, 22);
        leeds.playMatch (22, 12);

        hudds.playMatch (12, 18);
        wigan.playMatch (18, 12);

        hullf.playMatch (0, 34);
        wigan.playMatch (34, 0);

        leeds.playMatch (10, 10);
        wigan.playMatch (10, 10);

        sl.sortLeague ();

        System.out.println ("Super League Table");
        System.out.println ();

        sl.printLeague ();

    }
}
