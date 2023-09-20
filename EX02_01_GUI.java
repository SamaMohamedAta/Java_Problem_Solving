package CH02;

import javax.swing.JOptionPane;

public class EX02_01_GUI {

    public static void main(String[] args) {
        String stringTheCelsius = JOptionPane.showInputDialog(null, "Enter the degree in celsius");
        double theCelsius = Double.parseDouble(stringTheCelsius);
        double thefahrenheit = (9.0 / 5) * theCelsius + 32;
        JOptionPane.showMessageDialog(null, "The no in fehrenhiet is " + thefahrenheit);
    }
}
