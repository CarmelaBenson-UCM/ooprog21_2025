package Employee;


public class Employee {
    //employee number, pay rate, max employee number(Max is 9999)
    //max rate(max is 60.00),, multiplier for over time rate is 1.5
    //display regular pay and overtime pay based on hours worked this week

    final int MaxEmployeeNum = 9999;
    final double MaxRate = 60.00;
    final double multiplier = 1.5;
    private int employeeNum;
    private double payRate;

    public Employee(int employeeNum, double payRate) {

        if(employeeNum <= 0 || employeeNum > MaxEmployeeNum) {
            throw new IllegalArgumentException("Employee number is invalid.");
        }

        if(payRate <= 0 || payRate > MaxRate) {
            throw new IllegalArgumentException("Pay rate has exceeded the maximum rate.");
        }  
          
        this.employeeNum = employeeNum;
        this.payRate = payRate;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public double getRegularPay(double hoursWorked, double payRate) {
        if(hoursWorked <= 40) {
            return hoursWorked * payRate;
        } else {
            return 40 * payRate;
        }
    }

    public double getOvertimePay(double hoursWorked, double multiplier) {
        if(hoursWorked > 40) {
            double Overtimehrs = hoursWorked - 40; 
            return Overtimehrs * (payRate * multiplier);
        } else {
            return 0.0;
        }
    }

}
