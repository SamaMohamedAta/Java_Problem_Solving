package CH03;

import javax.swing.JOptionPane;

public class EX03_01_GUI {

    public static void main(String[] args) {

        //obtaining data from user
        String A = JOptionPane.showInputDialog(null, "Enter a: ");
        double a = Double.parseDouble(A);
        String B = JOptionPane.showInputDialog(null, "Enter b: ");
        double b = Double.parseDouble(B);
        String C = JOptionPane.showInputDialog(null, "Enter c: ");
        double c = Double.parseDouble(C);
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        //determining the roots type
        if (discriminant > 0) {
            double ans1 = (-1 * b + Math.pow(discriminant, 0.5)) / (2 * a);
            double ans2 = (-1 * b - Math.pow(discriminant, 0.5)) / (2 * a);
            JOptionPane.showMessageDialog(null, "The roots are " + ans1 + " and " + ans2);
        } else if (discriminant == 0) {
            double ans = (-1 * b) / (2 * a);
            JOptionPane.showMessageDialog(null, "The root is " + ans);
        } else {
            JOptionPane.showMessageDialog(null, "The equation has no real roots");
        }
    }
}
