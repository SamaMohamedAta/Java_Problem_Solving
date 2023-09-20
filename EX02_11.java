package CH02;

import java.util.Scanner;

public class EX02_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee's name: ");
        String name = input.nextLine();
        System.out.println("Enter number of hours worked in a week: ");
        int hours = input.nextInt();
        System.out.println("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.println("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        System.out.println("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();
        System.out.println("Employee Name: " + name + ".");
        System.out.println("Hours Worked: " + hours + ".");
        System.out.println("Pay Rate: $" + payRate + ".");
        double grossPay = payRate * 10;
        System.out.println("Gross Pay: $" + grossPay + ".");
        double Withholding20 = grossPay * federalTax;
        double Withholding9 = grossPay * stateTax;
        double total = Withholding20 + Withholding9;
        System.out.println("Deductions: \n  Federal Withholding (20.0%): $" + Withholding20
                + "\n  State Withholding (9.0%): $" + Withholding9 + "\n  Total Deduction: $"
                + total);
        System.out.println("Net Pay: $" + (grossPay - total));
    }
}
