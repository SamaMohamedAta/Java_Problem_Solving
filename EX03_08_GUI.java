package CH03;

import javax.swing.JOptionPane;

public class EX03_08_GUI {

    public static void main(String[] args) {
        //obtaining data from user
        JOptionPane.showMessageDialog(null, "Enter 3 different numbers plz: ");
        String n1 = JOptionPane.showInputDialog(null, "");
        int num1 = Integer.parseInt(n1);
        String n2 = JOptionPane.showInputDialog(null, "");
        int num2 = Integer.parseInt(n2);
        String n3 = JOptionPane.showInputDialog(null, "");
        int num3 = Integer.parseInt(n3);
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }
        JOptionPane.showMessageDialog(null, num1 + " < " + num2 + " < " + num3);
    }
}
