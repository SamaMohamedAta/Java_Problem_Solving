package CH02;

import javax.swing.JOptionPane;

public class EX02_05_GUI {

    public static void main(String[] args) {
        String stringsubtotal = JOptionPane.showInputDialog(null, "enter the subtotal ");
        double subtotal = Double.parseDouble(stringsubtotal);
        String stringgratuity = JOptionPane.showInputDialog(null, "enter the gratuity ");
        double gratuity = Double.parseDouble(stringgratuity);
        gratuity = subtotal * gratuity / 100;
        double total = subtotal + gratuity;
        JOptionPane.showMessageDialog(null, "the gratuity is " + gratuity + " and total is " + total + ".");
    }
}
