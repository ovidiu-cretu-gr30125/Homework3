package isp.lab3.exercise3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FootballPlayerTest {
    FootballPlayer f1 = new FootballPlayer("Benzema","Real Madrid",'M');
    @Test
    public void FootballPlayerTest(){
        ///FootballPlayer f1 = new FootballPlayer("Benzema","Real Madrid",'M');
        assertEquals("Team should be Real Madrid","Real Madrid",f1.getTeam());
        assertEquals("Name should be Benzema","Benzema",f1.getName());
        assertEquals("Gender should be M",'M',f1.getGender());
    }
    @Test
    public void getNameTest(){
        assertEquals("Name should be Benzema","Benzema",f1.getName());
    }
    @Test
    public void getTeamTest(){
        assertEquals("Team should be Real Madrid","Real Madrid",f1.getTeam());
    }
    @Test
    public void setTeamTest(){
        f1.setTeam("FCSB");
        assertEquals("Team should be FCSB","FCSB",f1.getTeam());
    }
    @Test
    public void getGoalsScoredTest(){
        f1.scoreGoals(10);
        assertEquals("10 goals",10,f1.getGoalsScored());
    }
    @Test
    public void scoreAGolTest(){
        f1.scoreAGoal();
        assertEquals("1 goal",1,f1.getGoalsScored());
    }
    @Test
    public void getGenderTest(){
        assertEquals("Gender should be M",'M',f1.getGender());
    }
    @Test
    public void scoreGoalsTest(){
        f1.scoreGoals(15);
        assertEquals("15 goals",15,f1.getGoalsScored());
    }
    @Test
    public void toStringTest(){
        assertEquals("Benzema (M) scored 0 goals for Real Madrid","Benzema (M) scored 0 goals for Real Madrid",f1.toString());
    }
}
