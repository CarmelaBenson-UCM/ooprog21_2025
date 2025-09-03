public class TableAndChairs {
    
    public static void main(String[] args) {
        
       int rows = 7;   
        int cols = 21;  

        for (int i = 1; i <= rows; i++) {       
            for (int j = 1; j <= cols; j++) {   
           
                if (j == 1 && i <= 3) {
                    System.out.print("X");
                }
                
                else if (j == cols && i <= 3) {
                    System.out.print("X");
                }
              
                else if (i == 4 && j >= 6 && j <= 14) {
                    System.out.print("X");
                }
                
                else if (i == 4 && j >= 1 && j <= 4) {
                    System.out.print("X");
                }
               
                else if (i == 4 && j >= 18 && j <= cols) {
                    System.out.print("X");
                }
            
                else if (i >= 5 && (j == 6 || j == 14)) {
                    System.out.print("X");
                }
              
                else if (i >= 5 && (j == 1 || j == 4)) {
                    System.out.print("X");
                }
               
                else if (i >= 5 && (j == cols || j == cols - 3)) {
                    System.out.print("X");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}




    
