package CH03;

import javax.swing.JOptionPane;

public class GUESSING_BIRTHDAY_03_GUI {

    public static void main(String[] args) {

        String set00 = "1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31";
        String set01 = "2,3,6,7,10,11,14,15,18,19,22,23,26,27,30,31";
        String set02 = "4,5,6,7,12,13,14,15,20,21,22,23,28,29,30,31";
        String set03 = "8,9,10,11,12,13,14,15,24,25,26,27,28,29,30,31";
        String set04 = "16,17,28,19,20,21,22,23,24,25,26,27,28,29,30,31";

        String input = JOptionPane.showInputDialog(null, "if your birth MONTH is"
                + " in this set enter 1 if not enter 0 \n"
                + set00);
        double result = Double.parseDouble(input);

        int month = 0;
        if (result == 1) {
            month += 1;
        }

        input = JOptionPane.showInputDialog(null, "if your birth MONTH is in this set enter 1 if not enter 0 \n"
                + set01);
        result = Double.parseDouble(input);
        if (result == 1) {
            month += 2;
        }

        input = JOptionPane.showInputDialog(null, "if your birth MONTH is in this set enter 1 if not enter 0 \n"
                + set02);
        result = Double.parseDouble(input);
        if (result == 1) {
            month += 4;
        }

        input = JOptionPane.showInputDialog(null, "if your birth MONTH is in this set enter 1 if not enter 0 \n"
                + set03);
        result = Double.parseDouble(input);
        if (result == 1) {
            month += 8;
        }

        input = JOptionPane.showInputDialog(null, "if your birth MONTH is in this set enter 1 if not enter 0 \n"
                + set04);
        result = Double.parseDouble(input);
        if (result == 1) {
            month += 16;
        }

        //to get the birth day 
        int day = 0;

        input = JOptionPane.showInputDialog(null, "if your birth DAY is in this set enter 1 if not enter 0 \n"
                + set00);
        result = Double.parseDouble(input);
        if (result == 1) {
            day += 1;
        }

        input = JOptionPane.showInputDialog(null, "if your birth DAY is in this set enter 1 if not enter 0 \n"
                + set01);
        result = Double.parseDouble(input);
        if (result == 1) {
            day += 2;
        }

        input = JOptionPane.showInputDialog(null, "if your birth DAY is in this set enter 1 if not enter 0 \n"
                + set02);
        result = Double.parseDouble(input);
        if (result == 1) {
            day += 4;
        }

        input = JOptionPane.showInputDialog(null, "if your birth DAY is in this set enter 1 if not enter 0 \n"
                + set03);
        result = Double.parseDouble(input);
        if (result == 1) {
            day += 8;
        }

        input = JOptionPane.showInputDialog(null, "if your birth DAY is in this set enter 1 if not enter 0 \n"
                + set04);
        result = Double.parseDouble(input);
        if (result == 1) {
            day += 16;
        }

        //  System.out.println("Your birth month is "+ month +".");
        switch (month) {
            case 1:
                JOptionPane.showMessageDialog(null, "You born in " + day + " January.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "You born in " + day + " Fabuary.");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "You born in " + day + " March.");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "You born in " + day + " April.");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "You born in " + day + " May.");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "You born in " + day + " June.");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "You born in " + day + " July.");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "You born in " + day + " August.");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "You born in " + day + " September.");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "You born in " + day + " October.");
                break;
            case 11:
                JOptionPane.showMessageDialog(null, "You born in " + day + " November.");
                break;
            case 12:
                JOptionPane.showMessageDialog(null, "You born in " + day + " December.");
                break;
        }
    }
}
