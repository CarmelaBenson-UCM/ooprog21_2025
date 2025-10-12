package Employee;
import java.util.Scanner;

public class Payroll {
    
    public static void main(String[] args) {
        
        double hoursWorked;
        double regularPayRate;

        System.out.print("Enter Employee Number: ");
        Scanner num = new Scanner(System.in);
        int employeeNum = num.nextInt();
        
        System.out.print("How many hours did you work this week? ");
        Scanner hrs = new Scanner(System.in);
        hoursWorked = hrs.nextDouble();
        
        System.out.print("What is your regular pay rate? ");
        Scanner pr = new Scanner(System.in);
        regularPayRate = pr.nextDouble();

        Employee emp = new Employee(employeeNum, regularPayRate);

        System.out.println("Regular pay is " + emp.getRegularPay(hoursWorked, regularPayRate));
        System.out.println("Overtime pay is " + emp.getOvertimePay(hoursWorked, 1.5));
        num.close();
        hrs.close();
        pr.close();
    }
}
