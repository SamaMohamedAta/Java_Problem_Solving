package CH03;

import javax.swing.JOptionPane;

public class EX03_03_GUI {

    public static void main(String[] args) {
        //obtaining data from user
        String A = JOptionPane.showInputDialog(null, "Enter a: ");
        double a = Double.parseDouble(A);
        String B = JOptionPane.showInputDialog(null, "Enter b: ");
        double b = Double.parseDouble(B);
        String C = JOptionPane.showInputDialog(null, "Enter c: ");
        double c = Double.parseDouble(C);
        String D = JOptionPane.showInputDialog(null, "Enter d: ");
        double d = Double.parseDouble(D);
        String E = JOptionPane.showInputDialog(null, "Enter e: ");
        double e = Double.parseDouble(E);
        String F = JOptionPane.showInputDialog(null, "Enter f: ");
        double f = Double.parseDouble(F);
        //to find x and y 
        if (a * d - b * c != 0) {
            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);
            JOptionPane.showMessageDialog(null, "x is " + x + " and y is " + y);
        } else {
            JOptionPane.showMessageDialog(null, "The equation has no solution");
        }

    }

}
