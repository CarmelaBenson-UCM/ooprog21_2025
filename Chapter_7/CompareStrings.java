import java.util.Scanner;

public class CompareStrings {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String predefined = "Carmen";

        System.out.print("Enter your name> ");
        String userInput = scanner.nextLine();

        if (userInput.equals(predefined)) {
            System.out.println(predefined + " equals to " + userInput);
        } else {
            System.out.println(predefined + " does not equal to " + userInput);
        }

        scanner.close();
    }
}
