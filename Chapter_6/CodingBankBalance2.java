import java.util.Scanner;

public class CodingBankBalance2 {
    
    public static void main(String[] args) {
        
        final double interestRate = 0.03;
        double balance;
        int choice;
        int year = 1;

        System.out.print("Enter initial bank balance > ");
        Scanner bb = new Scanner(System.in);
        balance = bb.nextDouble();

        do {
            balance = balance + balance * interestRate;
            System.out.println("After year " + year + " at 0.03 interest rate, balance is $" + balance);
            year++;
            System.out.println("\nDo you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes  or any other number for no >> ");
            choice = bb.nextInt();
        } while (choice == 1);

        bb.close();
    }
}

