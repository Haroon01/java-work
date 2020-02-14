package league;

import java.util.ArrayList;
import java.util.Collections;

public class SuperLeague {

    private ArrayList <RugbyTeam> theLeague;

    public SuperLeague () {
        this.theLeague = new ArrayList<> ();
    }

    public void addTeam (RugbyTeam rt) {
        this.theLeague.add (rt);
    }

    public void sortLeague () {
        Collections.sort (this.theLeague);
    }

    public void printLeague () {

        if (this.theLeague.isEmpty ()) {
            System.out.println ("No teams in the league");
        }
        else {
            for (RugbyTeam rt : theLeague) {
                rt.printLeagueTableLine ();
            }
        }
    }
}
