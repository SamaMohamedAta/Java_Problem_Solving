package CH03;

import javax.swing.JOptionPane;

public class EX03_25_GUI {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter the 1st edge: ");
        double e1 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog(null, "Enter the 2nd edge: ");
        double e2 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog(null, "Enter the 3rd edge: ");
        double e3 = Double.parseDouble(input);
        double per = e1 + e2 + e3;
        if (((e1 + e2) > e3) && ((e1 + e3) > e2) && ((e2 + e3) > e1)) {
            JOptionPane.showMessageDialog(null, "The perimeter of the Triangle is " + per);
        } else {
            JOptionPane.showMessageDialog(null, "the input is invalid !");
        }
    }
}
