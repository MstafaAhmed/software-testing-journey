package com.mycompany.soccerleaguesystem;

import java.util.ArrayList;

/**
 *
 * @author Mostafa Ahmed
 */
public class Team {

    //==============================================================
    // Attributes

    private int teamId;
    private String name;
    private String city;
    private String coach;

    // A Team has many Players
    private ArrayList<Player> players;

    // Team statistics
    private int matchesPlayed;
    private int wins;
    private int draws;
    private int losses;
    private int goalsFor;
    private int goalsAgainst;
    private int points;

    //==============================================================
    // Constructors

    public Team() {
        players = new ArrayList<>();
    }

    public Team(int teamId, String name, String city, String coach) {
        this.teamId = teamId;
        this.name = name;
        this.city = city;
        this.coach = coach;

        players = new ArrayList<>();

        // Initialize statistics
        matchesPlayed = 0;
        wins = 0;
        draws = 0;
        losses = 0;
        goalsFor = 0;
        goalsAgainst = 0;
        points = 0;
    }

    //==============================================================
    // Getters

    public int getTeamId() {
        return teamId;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCoach() {
        return coach;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public int getWins() {
        return wins;
    }

    public int getDraws() {
        return draws;
    }

    public int getLosses() {
        return losses;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public int getPoints() {
        return points;
    }

    //==============================================================
    // Setters

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public void setGoalsFor(int goalsFor) {
        this.goalsFor = goalsFor;
    }

    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    //==============================================================
    // Player Methods

    // Add a player to the team
    public void addPlayer(Player player) {
        players.add(player);
    }

    // Remove a player from the team
    public void removePlayer(Player player) {
        players.remove(player);
    }

    //==============================================================
    // Useful Method

    public int getGoalDifference() {
        return goalsFor - goalsAgainst;
    }

    //==============================================================

    public void display() {

        System.out.println("Team ID: " + teamId);
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Coach: " + coach);
        System.out.println("Players: " + players.size());

        System.out.println("Matches Played: " + matchesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Draws: " + draws);
        System.out.println("Losses: " + losses);
        System.out.println("Goals For: " + goalsFor);
        System.out.println("Goals Against: " + goalsAgainst);
        System.out.println("Goal Difference: " + getGoalDifference());
        System.out.println("Points: " + points);
    }
}