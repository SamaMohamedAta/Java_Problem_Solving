
package CH02;

import javax.swing.JOptionPane;


public class EX02_20_GUI {
       public static void main(String[] args) {
        String X1 = JOptionPane.showInputDialog(null,"Enter x1 : ");
        double x1 = Double.parseDouble(X1);
        String Y1 = JOptionPane.showInputDialog(null,"Enter y1 : ");
        double y1 = Double.parseDouble(Y1);
        String X2 = JOptionPane.showInputDialog(null,"Enter x2 : ");
        double x2 = Double.parseDouble(X2);
        String Y2 = JOptionPane.showInputDialog(null,"Enter y2 : ");
        double y2 = Double.parseDouble(Y2);
        double a = Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
        double distance = Math.pow(a,0.5);
        JOptionPane.showMessageDialog(null, "The distance of the two points is " + distance );
    }
}
