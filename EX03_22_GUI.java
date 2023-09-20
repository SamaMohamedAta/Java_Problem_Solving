
package CH03;

import javax.swing.JOptionPane;

public class EX03_22_GUI {
public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Enter a point with two coordinates: ");
        String X = JOptionPane.showInputDialog(null,"");
        double x1=Double.parseDouble(X);
        String Y = JOptionPane.showInputDialog(null,"");
        double y1=Double.parseDouble(Y);
        double in = Math.pow(x1,2)+Math.pow(y1, 2);
        double distance = Math.pow(in,0.5);
        if(distance<=10){
            JOptionPane.showMessageDialog(null,"The point (" + x1 + " , " + y1 + 
                    ") is in the circle.");
        } else 
            JOptionPane.showMessageDialog(null,"The point (" + x1 + " , " + y1 +
                    ") is not in the circle.");
    }    
}
