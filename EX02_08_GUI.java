package CH02;

import javax.swing.JOptionPane;

public class EX02_08_GUI {

    public static void main(String[] args) {
        String stringS1 = JOptionPane.showInputDialog(null, "Enter an ASCII code: ");
        int ascci = Integer.parseInt(stringS1);
        char rec = (char) ascci;
        JOptionPane.showMessageDialog(null, "The character for ASCII code " + ascci + " is " + rec + ".");

    }
}
