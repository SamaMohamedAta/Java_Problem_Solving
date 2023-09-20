package CH02;

import javax.swing.JOptionPane;

public class EX02_03_GUI {

    public static void main(String[] args) {
        String stringTheFeet = JOptionPane.showInputDialog(null, "enter the value for feet ");

        double feet = Double.parseDouble(stringTheFeet);
        double meter;
        meter = feet * 0.305;
        JOptionPane.showMessageDialog(null, feet + " feet is " + meter + " meter.");
    }
}
