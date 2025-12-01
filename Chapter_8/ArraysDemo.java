import java.util.Arrays; 
public class ArraysDemo {
   
   public static void main(String[] args) {
   
      int[] array = {0,0,0,0,0};
      display("Original Array", array);
      
      Arrays.fill(array, 8);
      display("Array After Filling with 8", array);
      
      array[2] = 6;   
      array[4] = 3;    
      display("Array After Changing Two Elements", array);
      
      Arrays.sort(array);
      display("Sorted Array", array);      
   }
   
   public static void display(String message, int array[]) {
        System.out.print(message + ": ");
        for (int value : array) {  
            System.out.print(value + " ");
        }
        System.out.println(); 
   }
}
