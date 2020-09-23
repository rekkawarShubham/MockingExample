import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestMock {
 Team team;
 ScoreService scoreService;

    public void setTeam(){
        team = new Team();
        scoreService = mock(ScoreService.class);
        team.setS(scoreService);
    }

    public boolean test(){
        List<Player> p= new ArrayList<>();
        Player p1 = new Player(1,"Shubham",10);
        Player p2 = new Player(2,"Surya" , 9);
        p.add(p1);
        p.add(p2);
        team.setPlayers(p);

        when(scoreService.getScore(p1)).thenReturn(109);
        when(scoreService.getScore(p2)).thenReturn(102);
        int total = team.getTotal();
        if(total == 211){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        TestMock t = new TestMock();
        t.setTeam();
        System.out.println(""+t.test()+" ");
    }
}
