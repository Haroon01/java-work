package league;

public class RugbyTeam implements Comparable <RugbyTeam> {

    private String name;

    private int gamesWon;
    private int gamesLost;
    private int gamesDrawn;

    private int pointsScored;
    private int pointsConceded;

    public RugbyTeam (String name)  {

        this.name = name;

        this.gamesWon = 0;
        this.gamesLost = 0;
        this.gamesDrawn = 0;

        this.pointsScored = 0;
        this.pointsConceded = 0;
    }

    public String getName () {
        return name;
    }

    public int getGamesWon () {
        return gamesWon;
    }

    public int getGamesLost () {
        return gamesLost;
    }

    public int getGamesDrawn () {
        return gamesDrawn;
    }

    public int getGamesPlayed () {
        return this.getGamesWon () + this.getGamesDrawn () + this.getGamesLost ();
    }

    public int getLeaguePoints () {
        return this.getGamesWon () * 2 + this.getGamesDrawn ();
    }

    public int getPointsScored () {
        return pointsScored;
    }

    public int getPointsConceded () {
        return pointsConceded;
    }

    public int getPointsDifference () {
        return this.getPointsScored() - this.getPointsConceded();
    }

    public void playMatch (int scored, int conceded)  {

        this.pointsScored += scored;
        this.pointsConceded += conceded;

        if (scored > conceded) {
            this.gamesWon ++;
        }
        else if (scored < conceded) {
            this.gamesLost ++;
        }
        else {
            this.gamesDrawn ++;
        }
    }

    @Override
    public int compareTo (RugbyTeam otherTeam) {

        if (otherTeam.getLeaguePoints() != this.getLeaguePoints()) {
            return otherTeam.getLeaguePoints() - this.getLeaguePoints();
        } else {
            return otherTeam.getPointsDifference() - this.getPointsDifference();
        }
    }

    public void printLeagueTableLine () {

        final String formatString = "%-22s %4d %4d %4d %4d %6d %6d %6d %4d";

        System.out.println (String.format (formatString, this.name,
                this.getGamesPlayed (),
                this.getGamesWon (), this.getGamesDrawn (), this.getGamesLost (),
                this.getPointsScored (), this.getPointsConceded (),
                this.getPointsDifference (),
                this.getLeaguePoints ()));

    }
}
