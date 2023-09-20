
package CH02;

import javax.swing.JOptionPane;

public class EX02_14_GUI {
    public static void main(String[] args) {
        String stringPounds = JOptionPane.showInputDialog(null,"Enter weight in pounds: ");
        double pounds = Double.parseDouble(stringPounds);
        double kilograms = pounds * 0.45359237;
        String stringInches = JOptionPane.showInputDialog(null,"Enter height in inches: ");
        int inches = Integer.parseInt(stringInches);
        double meters = inches * 0.0254;
        double BMI = kilograms / Math.pow(meters, 2);
        JOptionPane.showMessageDialog(null, "BMI is " + BMI + ".");
    }    
}
