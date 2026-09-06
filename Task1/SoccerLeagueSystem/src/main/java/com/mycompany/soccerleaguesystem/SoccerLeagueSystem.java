
package com.mycompany.soccerleaguesystem;
import java.time.LocalDateTime;

/**
 *
 * @author compu magic
 */
public class SoccerLeagueSystem {

    public static void main(String[] args) {
        
        // Create Schedule

        Schedule schedule = new Schedule();

        //==============================================================
        // Create 2 Teams

        Team Ahly = new Team( 1,"Al Ahly","Cairo","Coach Ahmed");

        Team Zamalek = new Team(2,"Zamalek", "Giza","Coach Mohamed");

        // Add teams to Schedule
        schedule.addTeam(Ahly);
        schedule.addTeam(Zamalek);

        //==============================================================
        // Create 5 Players for Team 1
        // Team 1 Players

Player p1 = new Player("Mostafa", "Egypt",e_Position.FORWARD, Ahly,25,0, 0);

Player p2 = new Player("Ahmed","Egypt",e_Position.MIDFIELDER,Ahly,24,0,0);

Player p3 = new Player("Omar","Egypt",e_Position.DEFENDER,Ahly,27,0,0);

Player p4 = new Player("Mahmoud","Egypt",e_Position.MIDFIELDER, Ahly,23,0,0);

Player p5 = new Player("Karim", "Egypt", e_Position.GOALKEEPER,Ahly,29,0,0);

        // Add players to Team 1
        Ahly.addPlayer(p1);
        Ahly.addPlayer(p2);
        Ahly.addPlayer(p3);
        Ahly.addPlayer(p4);
        Ahly.addPlayer(p5);

        //==============================================================
        // Create 5 Players for Team 2

Player p6 = new Player("Ali", "Egypt",e_Position.FORWARD,Zamalek,22,0, 0);

Player p7 = new Player("Tarek","Egypt",e_Position.MIDFIELDER,Zamalek,26,0,0);

Player p8 = new Player("Ashraf","Egypt",e_Position.DEFENDER,Zamalek,29,0,0);

Player p9 = new Player("Zizo","Egypt",e_Position.MIDFIELDER, Zamalek,25,0,0);

Player p10 = new Player("Sayed", "Egypt", e_Position.GOALKEEPER,Zamalek,31,0,0);
        // Add players to Team 2
        Zamalek.addPlayer(p6);
        Zamalek.addPlayer(p7);
        Zamalek.addPlayer(p8);
        Zamalek.addPlayer(p9);
        Zamalek.addPlayer(p10);

        //==============================================================
        // Create One Match

        Match match = new Match(
                1,
                Ahly,
                Zamalek,
                LocalDateTime.of(2026, 9, 10, 20, 0),
                "Cairo Stadium"
        );

        // Add match to Schedule
        schedule.addMatch(match);

        //==============================================================
        // Start Match

        match.startMatch();

        //==============================================================
        // Create Goals

        Goal goal1 = new Goal(1,1,p1,21 );

        Goal goal2 = new Goal(2,1,p6,34);

        Goal goal3 = new Goal(3,1, p1,85 );

        // Add goals to match
        match.addGoal(goal1);
        match.addGoal(goal2);
        match.addGoal(goal3);

        //==============================================================
        // Finish Match

        match.finishMatch();

        //==============================================================
        // Display Match
         System.out.println("====================== Player display ==========================");
         p1.display();
          System.out.println();
          
         System.out.println("======================= Team Display =========================");
          System.out.println();
         Ahly.display();
         System.out.println();
         
         System.out.println("======================== Match Display ========================");
          System.out.println();
          match.display();
          System.out.println();
         
          System.out.println("======================= Goal Display =========================");
          System.out.println();
         goal1.display();
          System.out.println();
          
         System.out.println("======================= schedule =========================");
          System.out.println();
  
        // Update Statistics
        schedule.updateStatistics();

        // Display Results Table

        schedule.displayResultsTable();
    }
}
    
