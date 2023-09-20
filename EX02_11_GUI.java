package CH02;

import javax.swing.JOptionPane;

public class EX02_11_GUI {

    public static void main(String[] args) {
        String stringName = JOptionPane.showInputDialog(null, "Enter employee's name: ");
        String stringHours = JOptionPane.showInputDialog(null, "Enter number of hours worked in a week: ");
        int hours = Integer.parseInt(stringHours);
        String stringPayRate = JOptionPane.showInputDialog(null, "Enter hourly pay rate: ");
        double payRate = Double.parseDouble(stringPayRate);
        String stringFederalTax = JOptionPane.showInputDialog(null, "Enter federal tax withholding rate: ");
        double federalTax = Double.parseDouble(stringFederalTax);
        String stringStateTax = JOptionPane.showInputDialog(null, "Enter state tax withholding rate: ");
        double stateTax = Double.parseDouble(stringStateTax);
        JOptionPane.showMessageDialog(null, "Employee Name: " + stringName + ".");
        JOptionPane.showMessageDialog(null, "Hours Worked: " + hours + ".");
        JOptionPane.showMessageDialog(null, "Pay Rate: $" + payRate + ".");
        double grossPay = payRate * 10;
        JOptionPane.showMessageDialog(null, "Gross Pay: $" + grossPay + ".");
        double Withholding20 = grossPay * federalTax;
        double Withholding9 = grossPay * stateTax;
        double total = Withholding20 + Withholding9;
        JOptionPane.showMessageDialog(null, "Deductions: \n  Federal Withholding (20.0%): $" + Withholding20
                + "\n  State Withholding (9.0%): $" + Withholding9 + "\n  Total Deduction: $"
                + total);
        JOptionPane.showMessageDialog(null, "Net Pay: $" + (grossPay - total));
    }
}
