import javafx.beans.binding.ObjectBinding;

public class team {
    private Integer pos;
    private String name;
    private Integer played;
    private Integer won;
    private Integer lost;
    private Integer drawn;
    private Integer scrFor;
    private Integer against;
    private Integer ptsDiff;
    private Integer points;

    public team(Integer pos, String name, Integer played, Integer won, Integer lost, Integer drawn, Integer scrFor, Integer against, Integer ptsDiff, Integer points) {
        this.pos = pos;
        this.name = name;
        this.played = played;
        this.won = won;
        this.lost = lost;
        this.drawn = drawn;
        this.scrFor = scrFor;
        this.against = against;
        this.ptsDiff = ptsDiff;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPlayed() {
        return played;
    }

    public void setPlayed(Integer played) {
        this.played = played;
    }

    public Integer getWon() {
        return won;
    }

    public void setWon(Integer won) {
        this.won = won;
    }

    public Integer getLost() {
        return lost;
    }

    public void setLost(Integer lost) {
        this.lost = lost;
    }

    public Integer getDrawn() {
        return drawn;
    }

    public void setDrawn(Integer drawn) {
        this.drawn = drawn;
    }

    public Integer getScrFor() {
        return scrFor;
    }

    public void setScrFor(Integer scrFor) {
        this.scrFor = scrFor;
    }

    public Integer getAgainst() {
        return against;
    }

    public void setAgainst(Integer against) {
        this.against = against;
    }

    public Integer getPtsDiff() {
        return ptsDiff;
    }

    public void setPtsDiff(Integer ptsDiff) {
        this.ptsDiff = ptsDiff;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public Object team(){
        new team hull = new team(1)
    }


}
