package com.mycompany.soccerleaguesystem;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Mostafa Ahmed
 */
public class Match {

    //==============================================================
    // Attributes

    private int matchId;

    // A Match has two Teams
    private Team homeTeam;
    private Team awayTeam;

    private LocalDateTime dateTime;
    private String stadium;

    private int homeScore;
    private int awayScore;

    // A Match has many Goals
    private ArrayList<Goal> goals;

    private e_MatchStatus status;

    //==============================================================
    // Constructors

    // Default constructor
    public Match() {
        goals = new ArrayList<>();
        homeScore = 0;
        awayScore = 0;
        status = e_MatchStatus.SCHEDULED;
    }

    // Parameterized constructor
    public Match(int matchId, Team homeTeam, Team awayTeam,
                 LocalDateTime dateTime, String stadium) {

        this.matchId = matchId;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.dateTime = dateTime;
        this.stadium = stadium;

        this.homeScore = 0;
        this.awayScore = 0;

        this.goals = new ArrayList<>();

        this.status = e_MatchStatus.SCHEDULED;
    }

    //==============================================================
    // Getters

    public int getMatchId() {
        return matchId;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getStadium() {
        return stadium;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public ArrayList<Goal> getGoals() {
        return goals;
    }

    public e_MatchStatus getStatus() {
        return status;
    }

    //==============================================================
    // Setters

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public void setGoals(ArrayList<Goal> goals) {
        this.goals = goals;
    }

    public void setStatus(e_MatchStatus status) {
        this.status = status;
    }

    //==============================================================
    // Goal Methods

    // Add a goal to the match
    public void addGoal(Goal goal) {

        goals.add(goal);

        // Update the score according to the scorer's team
        if (goal.getScorer() != null) {

            if (goal.getScorer().getTeam() == homeTeam) {
                homeScore++;
            }
            else if (goal.getScorer().getTeam() == awayTeam) {
                awayScore++;
            }
        }
    }

    // Remove a goal
    public void removeGoal(Goal goal) {

        if (goals.remove(goal)) {

            if (goal.getScorer() != null) {

                if (goal.getScorer().getTeam() == homeTeam) {
                    homeScore--;
                }
                else if (goal.getScorer().getTeam() == awayTeam) {
                    awayScore--;
                }
            }
        }
    }

    //==============================================================
    // Match Methods

    // Start the match
    public void startMatch() {
        status = e_MatchStatus.LIVE;
    }

    // Finish the match
    public void finishMatch() {
        status = e_MatchStatus.FINISHED;
    }

    // Get winner
    public Team getWinner() {

        if (status != e_MatchStatus.FINISHED) {
            return null;
        }

        if (homeScore > awayScore) {
            return homeTeam;
        }
        else if (awayScore > homeScore) {
            return awayTeam;
        }

        return null; // Draw
    }

    // Check if match is a draw
    public boolean isDraw() {

        return status == e_MatchStatus.FINISHED
                && homeScore == awayScore;
    }

    //==============================================================
    // Display Method

    public void display() {

        System.out.println("------------------------------------------");
        System.out.println("Match ID: " + matchId);
        System.out.println("Home Team: " + homeTeam.getName());
        System.out.println("Away Team: " + awayTeam.getName());

        System.out.println(
                "Score: " + homeScore + " - " + awayScore
        );

        System.out.println("Date & Time: " + dateTime);
        System.out.println("Stadium: " + stadium);
        System.out.println("Status: " + status);

        System.out.println("Goals:");

        for (Goal goal : goals) {
            System.out.println(
                    "  " + goal.getScorer().getName()
                    + " - " + goal.getMinute() + "'"
            );
        }

        System.out.println("------------------------------------------");
    }
}