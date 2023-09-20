package CH03;

import javax.swing.JOptionPane;

public class EX03_05_GUI {

    public static void main(String[] args) {
        int x = (int) ((double) Math.random() * 100);
        int y = (int) ((double) Math.random() * 100 + 1);
        int z = (int) ((double) Math.random() * 100 + 2);
        String s = JOptionPane.showInputDialog(null, "Enter the sum of " + x + " + " + y + " + " + z);
        int result = Integer.parseInt(s);
        if (x + y + z == result) {
            JOptionPane.showMessageDialog(null, "Your answer is true. ");
        } else {
            JOptionPane.showMessageDialog(null, "Your answer is False. ");
        }
    }
}
