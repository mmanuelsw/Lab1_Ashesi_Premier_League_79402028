// Kwasi Bekae Ackonor
// 79402028
// It’s a Java program that collects a player’s personal and performance data, converts units,
// determines their category, position, eligibility, lineup status, and prints a complete player report.

import java.util.Scanner;
public class PlayerSelection{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);



    //  Taking User Inputs.
    System.out.println("Enter your name: ");
    String name = input.nextLine();

    System.out.println("Enter your age: ");
    int age = input.nextInt();

    System.out.println("Enter your height in meters: ");
    float height = input.nextFloat();

    System.out.println("Enter your weight (in pounds): ");
    float weight = input.nextFloat();

    System.out.println("Enter your jersey number: ");
    int jersey_number = input.nextInt();


    // Converting units of data taking.
    final double POUND = 0.45359237;
    final int METER = 100;

    // Weight to kilograms
    double weight_in_kilograms= weight * POUND; 
    int rounded_weight = (int) weight_in_kilograms;
    
    // Height to centimeters
    double height_in_centimeters = height * METER;


    // Category Determination by Age
    String category;
    if (age < 20) {
    category = "Rising Star.";
    } 
    else if (age >= 20 && age <=30) {
    category = "Prime Player";
    }
    else {
    category = "Veteran";
    }

    // Attackers jersey
    String attacker_status = "No";




    // Category Determination by Position
    System.out.println("Coach, enter the jersey number: ");
    int coach_choice = input.nextInt();

        String position;
      switch (coach_choice) {
        case 1:
        position = "Goalkeeper";
        break;

        case 2:
        position = "defender";
        break;

        case 5:
        position = "Winger"; 
        attacker_status = "Yes";
        break;
        

        case 6:
        case 8: 
        position = "Midfielder";
        break;
    

        case 7:
        case 11:
        position = "Winger";
        attacker_status = "Yes";
        break;
       

        case 9:
        position = "Striker";
        attacker_status = "Yes";
        break;

        case 10:
        position = "Playmaker";
        break;



        default:
        position = "Player position not known";
        break;
    

          
    }


    // Eligibility Determination
    String eligibility;
    if (age >= 18 && age<= 35 && weight_in_kilograms < 90) {
        eligibility = "Eligible";

    } else {
        eligibility = "Not Eligible";
    }


    // Lineup Decision
  String lineupDecision = "Bench"; // default
if (age >= 20 && age <= 30) {
    if (weight_in_kilograms < 80) {
        lineupDecision = "Part of starting lineup.";
    }
}


        // Final Decision
        String final_decision;
        if (age >= 18 && age<= 35 && weight_in_kilograms < 90) {
        final_decision = "Play";

        } 
        else {
        final_decision = "Rest";
    }


        // Displaying Player Report
        System.out.println("Player Report.");
        System.out.println("Player: " + name);
        System.out.println("Age: " + age + " (" + category + ")");
        System.out.println("Height: " + height_in_centimeters + "cm");
        System.out.println("Weight: " + rounded_weight + "kg");
        System.out.println("Jersey: " + jersey_number);
        System.out.println("Position: " + position);
        System.out.println("Attacker jersey: " + attacker_status);
        System.out.println("Eligibility: " + eligibility);
        System.out.println("Lineup Decision: " + lineupDecision);
        System.out.println("Final Decision: " + final_decision);


        
}
} 
