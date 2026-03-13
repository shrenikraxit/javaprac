package fundamentals;

// ENCAPSULATION and Getters and Setters
// Read: https://www.w3schools.com/java/java_encapsulation.asp

import java.util.Scanner;

public class GetSetTester {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //create a new object for my GetSet class
        GetSet player1 = new GetSet();
        GetSet player2 = new GetSet();

        player1.setUsername("pineappleghost333"); //sets (or mutates) username to new value
        player1.setId(4545); //sets (or mutates) username to new value
        player1.setRank("Hacker");

        System.out.println(player2.getUsername()); //displays default username value of null
        player2.setUsername("ironmouse6741"); //sets (or mutates) username to new value
        System.out.println(player2.getUsername()); //displays new username 

        // taking in user input
        GetSet player3 = new GetSet();
        System.out.print("Enter a username: ");
        String userInput = input.nextLine();
        player3.setUsername(userInput);
        System.out.print("Enter a rank (N00b, Bruh, Novice, Hacker, Gawd): ");
        String userInputRank = input.nextLine();
        player3.setRank(userInputRank);
        System.out.print("Enter an id: ");
        int userInputId = input.nextInt();
        player3.setId(userInputId);

        System.out.println(player3.getUsername() + "-" + player3.getRank()); //displays new username 
        System.out.println(player3.getRankMessage()); //displays rank-based message
        
    }
}

class GetSet{
    //instance variables; attributes; making the instance 'private' enforces ENCAPSULATION
    private String username = "No user name";
    private int id = 0;
    private String rank = "N00b";

    //accesor methods aka GETTERS:
    public String getUsername(){
        return username;
    }
    public String getRank(){
        return rank;
    }
    public int getId(){
        return id;
    }
    
    //CHALLENGE 3: Method to display message based on rank
    public String getRankMessage(){
        if(rank.equals("N00b")){
            return "You are just starting out!";
        } else if(rank.equals("Bruh")){
            return "You're doing alright!";
        } else if(rank.equals("Novice")){
            return "You're getting good!";
        } else if(rank.equals("Hacker")){
            return "You are one powerful hacker!";
        } else if(rank.equals("Gawd")){
            return "You are a legend!";
        } else {
            return "Unknown rank!";
        }
    }
    
    //mutator methods aka SETTERS
    public void setUsername(String newUsername){
        this.username = newUsername;
    }
    public void setRank(String newRank){
        this.rank = newRank;
    }
    public void setId(int newId){
        this.id = newId;
    }
}