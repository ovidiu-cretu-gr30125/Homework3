package isp.lab3.exercise3;

import java.util.Random;

public class Exercise3 {
    public static void main (String[]args){
        FootballPlayer f1 = new FootballPlayer("Messi","Barcelona",'M');
        System.out.println(f1.getName());
        System.out.println(f1.getTeam());
        System.out.println(f1.getGender());
        System.out.println(f1.getGoalsScored());
        System.out.println(f1);
        f1.scoreAGoal();
        f1.setTeam("Juventus");
        System.out.println(f1);
        Random x= new Random();
        FootballPlayer f2= new FootballPlayer("Iniesta","Barcelona",'M');
        f2.scoreGoals(15+x.nextInt(16));
        System.out.println(f2);
    }
}
