package CH02;

import javax.swing.JOptionPane;

public class EX02_04_GUI {

    public static void main(String[] args) {
        String stringPounds = JOptionPane.showInputDialog(null, "enter the value for pounds ");
        double pounds = Double.parseDouble(stringPounds);
        double kiloGrams = pounds * 0.454;
        JOptionPane.showMessageDialog(null, pounds + " pound is " + kiloGrams + " kilograms.");
    }
}
