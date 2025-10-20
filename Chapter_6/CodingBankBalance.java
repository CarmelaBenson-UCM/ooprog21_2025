import java.util.Scanner;

public class CodingBankBalance {
    
    public static void main(String[] args) {
        
        final double interestRate = 0.03;
        double balance;
        int choice;
        int year = 1;

        System.out.print("Enter initial bank balance > ");
        Scanner bb = new Scanner(System.in);
        balance = bb.nextDouble();

        System.out.println("Do you want to see next year's balance?");
        System.out.print("Enter 1 for yes  or any other number for no >> ");
        choice = bb.nextInt();

        while (choice == 1) {
            balance = balance + balance * interestRate;
            System.out.println("After year " + year + " at 0.03 interest rate, balance is $" + balance);
            year++;
            System.out.println("\nDo you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes  or any other number for no >> ");
            choice = bb.nextInt();
        }

        bb.close();
    }
}
