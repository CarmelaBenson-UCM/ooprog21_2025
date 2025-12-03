import java.util.*;

public class ForexExchangeSystem {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.println("Currency: AUD");

      int[] rates = new int[5];

      for (int i = 0; i < 5; i++) {
         System.out.print("Rate on Nov " + (i + 1) + ": ");
         rates[i] = input.nextInt();
      }

      System.out.println("\n=== EXCHANGE RATES ===");
      for (int i = 0; i < 5; i++) {
         System.out.println("Nov " + (i + 1) + ": " + rates[i]);
      }

      int peak = rates[0];
      int low = rates[0];

      for (int i = 1; i < 5; i++) {
         if (rates[i] > peak) peak = rates[i];
         if (rates[i] < low) low = rates[i];
      }

      System.out.println("\nPeak Rate: " + peak);
      System.out.println("Lowest Rate: " + low);

      System.out.println("\n=== DAILY CHANGES ===");
      for (int i = 1; i < 5; i++) {
         if (rates[i] > rates[i - 1])
            System.out.println("Nov " + (i + 1) + ": Increased");
         else if (rates[i] < rates[i - 1])
            System.out.println("Nov " + (i + 1) + ": Decreased");
         else
            System.out.println("Nov " + (i + 1) + ": No Change");
      }
   }
}
