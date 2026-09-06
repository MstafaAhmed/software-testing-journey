package com.mycompany.soccerleaguesystem;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Mostafa Ahmed
 */
public class Schedule {

    private ArrayList<Team> teams;
    private ArrayList<Match> matches;

    
    //==============================================================
    // Constructor

    public Schedule() {
        teams = new ArrayList<>();
        matches = new ArrayList<>();
    }

    //==============================================================
    // Getters

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }

    //==============================================================
    // Add Team

    public void addTeam(Team team) {
        teams.add(team);
    }

    //==============================================================
    // Add Match

    public void addMatch(Match match) {
        matches.add(match);
    }

    //==============================================================
    // Update Team Statistics

    public void updateStatistics() {

        // Reset all team statistics before calculating again
        for (Team team : teams) {
            team.setMatchesPlayed(0);
            team.setWins(0);
            team.setDraws(0);
            team.setLosses(0);
            team.setGoalsFor(0);
            team.setGoalsAgainst(0);
            team.setPoints(0);
        }

        // Calculate statistics from finished matches
        for (Match match : matches) {

            if (match.getStatus() != e_MatchStatus.FINISHED) {
                continue;
            }

            Team homeTeam = match.getHomeTeam();
            Team awayTeam = match.getAwayTeam();

            int homeScore = match.getHomeScore();
            int awayScore = match.getAwayScore();

            // Matches played
            homeTeam.setMatchesPlayed(
                    homeTeam.getMatchesPlayed() + 1
            );

            awayTeam.setMatchesPlayed(
                    awayTeam.getMatchesPlayed() + 1
            );

            // Goals
            homeTeam.setGoalsFor(
                    homeTeam.getGoalsFor() + homeScore
            );

            homeTeam.setGoalsAgainst(
                    homeTeam.getGoalsAgainst() + awayScore
            );

            awayTeam.setGoalsFor(
                    awayTeam.getGoalsFor() + awayScore
            );

            awayTeam.setGoalsAgainst(
                    awayTeam.getGoalsAgainst() + homeScore
            );

            // Result
            if (homeScore > awayScore) {

                // Home team wins
                homeTeam.setWins(homeTeam.getWins() + 1);
                homeTeam.setPoints(homeTeam.getPoints() + 3);

                // Away team loses
                awayTeam.setLosses(awayTeam.getLosses() + 1);

            } else if (awayScore > homeScore) {

                // Away team wins
                awayTeam.setWins(awayTeam.getWins() + 1);
                awayTeam.setPoints(awayTeam.getPoints() + 3);

                // Home team loses
                homeTeam.setLosses(homeTeam.getLosses() + 1);

            } else {

                // Draw
                homeTeam.setDraws(homeTeam.getDraws() + 1);
                awayTeam.setDraws(awayTeam.getDraws() + 1);

                // One point for each team
                homeTeam.setPoints(homeTeam.getPoints() + 1);
                awayTeam.setPoints(awayTeam.getPoints() + 1);
            }
        }
    }

    //==============================================================
    // Calculate Goal Difference

    public int getGoalDifference(Team team) {
        return team.getGoalsFor() - team.getGoalsAgainst();
    }

    //==============================================================
    // Rank Teams

    public void rankTeams() {

        teams.sort(
            Comparator
                .comparingInt(Team::getPoints)
                .reversed()
                .thenComparingInt(this::getGoalDifference)
                .reversed()
                .thenComparingInt(Team::getGoalsFor)
                .reversed()
        );
    }

    //==============================================================
    // Display Results Table

    public void displayResultsTable() {

        updateStatistics();
        rankTeams();

        System.out.println(
                "=========================================================================="
        );

        System.out.printf(
                "%-5s %-20s %-5s %-5s %-5s %-5s %-5s %-5s %-5s%n",
                "Rank",
                "Team",
                "MP",
                "W",
                "D",
                "L",
                "GF",
                "GA",
                "PTS"
        );

        System.out.println(
                "=========================================================================="
        );

        int rank = 1;

        for (Team team : teams) {

            System.out.printf(
                    "%-5d %-20s %-5d %-5d %-5d %-5d %-5d %-5d %-5d%n",
                    rank,
                    team.getName(),
                    team.getMatchesPlayed(),
                    team.getWins(),
                    team.getDraws(),
                    team.getLosses(),
                    team.getGoalsFor(),
                    team.getGoalsAgainst(),
                    team.getPoints()
            );

            rank++;
        }

        System.out.println(
                "=========================================================================="
        );
    }

    //==============================================================
    // Display Match Details

    public void displayMatchDetails() {

        System.out.println("\n========== MATCH DETAILS ==========\n");

        for (Match match : matches) {

            System.out.println(
                    "Match ID: " + match.getMatchId()
            );

            System.out.println(
                    "Home Team: " + match.getHomeTeam().getName()
            );

            System.out.println(
                    "Away Team: " + match.getAwayTeam().getName()
            );

            System.out.println(
                    "Score: " +
                    match.getHomeScore() +
                    " - " +
                    match.getAwayScore()
            );

            System.out.println(
                    "Stadium: " + match.getStadium()
            );

            System.out.println(
                    "Date: " + match.getDateTime()
            );

            System.out.println(
                    "Status: " + match.getStatus()
            );

            System.out.println("-----------------------------------");
        }
    }
}