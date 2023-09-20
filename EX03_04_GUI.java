package CH03;

import javax.swing.JOptionPane;

public class EX03_04_GUI {

    public static void main(String[] args) {
        int x = (int) ((double) Math.random() * 100);
        int y = (int) ((double) Math.random() * 100 + 1);
        String s = JOptionPane.showInputDialog(null, "Enter the sum of " + x + " + " + y);
        int result = Integer.parseInt(s);
        if (x + y == result) {
            JOptionPane.showMessageDialog(null, "Your answer is true. ");
        } else {
            JOptionPane.showMessageDialog(null, "Your answer is False. ");
        }
    }
}
