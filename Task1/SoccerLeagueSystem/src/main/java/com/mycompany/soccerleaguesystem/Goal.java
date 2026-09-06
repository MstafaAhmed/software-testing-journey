
package com.mycompany.soccerleaguesystem;

/**
 *
 * @author mostfa ahmed 
 */
public class Goal {

    private int goalId;
    private int matchId;
    private Player scorer;
    private int minute;
    
    //==============================================================
    // Constructors

    public Goal() {
    }

    public Goal(int goalId, int matchId, Player scorer, int minute) {
        this.goalId = goalId;
        this.matchId = matchId;
        this.scorer = scorer;
        this.minute = minute;
    }
    
     //==============================================================
    // Getters
    
    public int getGoalId() {
        return goalId;
    }

    public int getMatchId() {
        return matchId;
    }

    public Player getScorer() {
        return scorer;
    }

    public int getMinute() {
        return minute;
    }
    
    //==============================================================
    // Setters
    
    public void setGoalId(int goalId) {
        this.goalId = goalId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public void setScorer(Player scorer) {
        this.scorer = scorer;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
    
//==============================================================
    // Useful method
    
    public void display() {
        System.out.println( "Goal{" +
                "goalId=" + goalId +
                ", matchId=" + matchId +
                ", scorer=" + scorer.getName() +
                ", minute=" + minute +
                '}');
    }
}