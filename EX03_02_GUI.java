package CH03;

import javax.swing.JOptionPane;

public class EX03_02_GUI {

    public static void main(String[] args) {
        String Num = JOptionPane.showInputDialog(null, "Enter an integer: ");
        int num = Integer.parseInt(Num);
        JOptionPane.showMessageDialog(null, "Is " + num + " an even number?");
        if (num % 2 == 0) {
            JOptionPane.showMessageDialog(null, " true");
        } else {
            JOptionPane.showMessageDialog(null, " False");
        }

    }

}
