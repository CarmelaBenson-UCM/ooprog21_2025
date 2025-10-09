package DebugFive;
// DebugFive1
// Adds your lunch bill
// Burger and hot dog are $2.59
// Grilled cheese and fish are $1.99
// Fries are 89 cents

import java.util.Scanner;

public class DebugFive1 {
    public static void main(String args[]) {

        final double HIGH_PRICE = 2.59;
        final double MED_PRICE = 1.99;
        final double LOW_PRICE = 0.89;
        int usersChoice;
        double bill = 0.0;

        System.out.print("Order please: 1 - Burger\n" + 
                         "              2 - Hotdog\n" +
                         "              3 - Grilled cheese\n" +
                         "              4 - Fish sandwich >> ");

        Scanner kb = new Scanner(System.in);
        usersChoice = kb.nextInt();

        if(usersChoice == 1 || usersChoice == 2) {
            bill += HIGH_PRICE;
        } else if(usersChoice == 3 || usersChoice == 4){
            bill += MED_PRICE;
        } else{
            System.out.print("Invalid choice! No main item added.");
        }
           
        System.out.print("Fries with that? 1 - Yes 2 - No >> ");
        usersChoice = kb.nextInt();

        if(usersChoice == 1) {
            bill += LOW_PRICE;
            System.out.println("Total bill is $" + bill);
        }
    }
}
