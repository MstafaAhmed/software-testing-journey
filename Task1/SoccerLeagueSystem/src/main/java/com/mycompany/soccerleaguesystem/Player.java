package com.mycompany.soccerleaguesystem;

/**
 *
 * @author mostafa ahmed
 * 
 * 
 */

public class Player {

    // -------Attributes-------------------------
   private String name; 
   private String nationality; 
   private e_Position position; 
   private Team team;  
   private int age;
   private int goals;
   private int assists;
   
   /*
   -----------------------------------------------------------------
   */
   // Constructor
   public Player(){}
   public Player(String name,String nationality , e_Position position , Team team,
                 int age , int goals , int assists)
 {
    setName(name);
    setNationality(nationality);
    setPosition(position);
    setTeam(team);
    setAge(age);
    setGoals(goals);
    setAssists(assists);
    
   }
   
   /*
   -----------------------------------------------------------------
   */
   
   
   // Getter
   
   public String getName(){
       return name;
   }
   
   public String getNationality(){
       return nationality;
   }
   
   public e_Position getPosition(){
       return position;
   }
   
    public Team getTeam(){
       return team;
   }
    
    public int getAge(){
        return age;
    }
    
    public int getGoals(){
        return goals;
    }
    
    public int getAssists(){
        return assists;
    }
   
   /*
   -----------------------------------------------------------------
   */
   
   // --------------- setter --------------------------------
   public void setName(String name){
       if (name == null || name.trim().isEmpty()) {
        System.out.println("Invalid player name!");
        return;
    }
       this.name = name;
   }
   
   public void setNationality(String nationality){
       if (nationality == null || nationality.trim().isEmpty()) {
        System.out.println("Invalid player nationality !");
        return;
    }
       this.nationality = nationality;
   }
   
   public void setPosition(e_Position position){
         if (position == null ) {
        System.out.println("Invalid player position !");
        return;
    }
       this.position = position;
   }
   
  public void setTeam(Team team) {
    this.team = team;
    }
 
   
   public void setAge(int age){
    if(age < 15  || age > 60){
        System.out.println("Invalid age !!!");
        return ;
    }
    
        this.age = age;

   }
    public void setGoals(int goals){
        if(goals < 0){
            System.out.println("Invalid goals number !!!");
            return ;
        }
            this.goals = goals;

   } 
    public void setAssists(int assists){
        if(assists < 0){
            System.out.println("Invalid assists number !!!");
            return ;
        }
            this.assists = assists;
      }
    
    
    /*
    -------------------------------------------------------------------
    */
    
    // Display
    
    public void display() {
    System.out.println("----- Player Information -----");
    System.out.println("Name        : " + name);
    System.out.println("Nationality : " + nationality);
    System.out.println("Position    : " + position);
    System.out.println("Team        : " + team);
    System.out.println("Age         : " + age);
    System.out.println("Goals       : " + goals);
    System.out.println("Assists     : " + assists);
}
}
