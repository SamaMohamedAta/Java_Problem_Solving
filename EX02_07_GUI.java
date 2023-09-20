package CH02;

import javax.swing.JOptionPane;

public class EX02_07_GUI {

    public static void main(String[] args) {
        String stringMinutes = JOptionPane.showInputDialog(null, "Enter the number of minutes");
        int minutes = Integer.parseInt(stringMinutes);
        int hours = minutes / 60;
        int days = hours / 24;
        int remainingDays = days % 365;
        int years = days / 365;
        JOptionPane.showMessageDialog(null, minutes + " minutes is approximately " + years + " years and " + remainingDays + " days.");
    }
}
