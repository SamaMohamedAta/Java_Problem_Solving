package CH02;

import javax.swing.JOptionPane;

public class EX02_06_GUI {

    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog(null, "Enter a number between 0 and 1000: ");
        int thenum1 = Integer.parseInt(num);
        int sum;
        sum = thenum1 % 10;
        thenum1 = thenum1 / 10;
        sum += thenum1 % 10;
        thenum1 = thenum1 / 10;
        sum += thenum1 % 10;
        JOptionPane.showMessageDialog(null, "The sum of the digits is " + sum + ".");

    }
}
