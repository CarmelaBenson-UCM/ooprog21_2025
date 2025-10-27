import java.util.Scanner;

public class BankBalanceByRateAndYear {
    
    public static void main(String[] args) {

      System.out.print("Enter initial balance > ");
      Scanner input = new Scanner(System.in);
      double balance = input.nextDouble();
  
      for(double rate = 0.02; rate <= 0.05; rate += 0.01) {
          double newBalance = balance;
          System.out.println("With an initial balance of $" + balance +" at an interest rate of %" + rate);
  
          for(int yr = 1; yr <= 4; yr++) {
              newBalance = newBalance + (newBalance * rate);
              System.out.println("After year " + yr +"balance is $" + newBalance);
          }
      }

    }

}
