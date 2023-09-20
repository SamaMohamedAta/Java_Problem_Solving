package CH02;

import javax.swing.JOptionPane;

public class EX02_19_GUI {

    public static void main(String[] args) {
        long num = System.currentTimeMillis();
        num = num % 26;
        num += 63;
        char rec = (char) num;
        JOptionPane.showMessageDialog(null, "The random upperLetter is " + rec);
    }
}
