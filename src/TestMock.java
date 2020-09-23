import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class TestMock {
@Mock
 ScoreService scoreService;

@InjectMocks
 Team team;
    public void setTeam(){
        team = new Team();
        scoreService = mock(ScoreService.class);
        team.setS(scoreService);
    }

    @Test
    public void test(){
        List<Player> p= new ArrayList<>();
        Player p1 = new Player(1,"Shubham",10);
        Player p2 = new Player(2,"Surya" , 9);
        p.add(p1);
        p.add(p2);
        team.setPlayers(p);

        when(scoreService.getScore(p1)).thenReturn(109);
        when(scoreService.getScore(p2)).thenReturn(102);
        int total = team.getTotal();
//        if(total == 211){
//            return true;
//        }
//        else {
//            return false;
//        }
       System.out.println("Mock junit");
        int expected = 211;
        Assert.assertEquals(expected,total);
    }

    public static void main(String[] args) {
        TestMock t = new TestMock();
        t.setTeam();

    }
}
