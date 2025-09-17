public class DemoGrossPay {

   public static void main(String[] args) {
      
      double rate = 22.75;
      calculateGross(10.0, rate);
      calculateGross(25.0, rate);
      calculateGross(37.5, rate);     
   }
   
   public static void calculateGross(double hrs, double rate) {
   
      double grosspay = hrs*rate;
      System.out.println(hrs + " hours at $" + rate + " per hour is $" + grosspay);
   }
}
