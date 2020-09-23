import java.util.ArrayList;
import java.util.List;

public class Team {
    private  ScoreService s;
    private List<Player> players;

    public ScoreService getS() {
        return s;
    }

    public void setS(ScoreService s) {
        this.s = s;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getTotal(){
        int total=0;
        for(Player p : players ){
            total = s.getScore(p);
        }
        return total;
    }
}
