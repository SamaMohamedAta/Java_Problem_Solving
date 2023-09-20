
package CH03;

import javax.swing.JOptionPane;

public class GUESSING_BIRTHDAY_03_GUI2 {
      public static void main(String[] args) {

        String set00 = "1,3,5,7\n"
                + "9,11,13,15\n"
                + "17,19,21,23\n"
                + "25,27,29,31";
        String set01 = "2,3,6,7\n"
                + "10,11,14,15\n"
                + "18,19,22,23\n"
                + "26,27,30,31";
        String set02 = "4,5,6,7\n"
                + "12,13,14,15\n"
                + "20,21,22,23\n"
                + "28,29,30,31";
        String set03 = "8,9,10,11\n"
                + "12,13,14,15\n"
                + "24,25,26,27\n"
                + "28,29,30,31";
        String set04 = "16,17,28,19\n"
                + "20,21,22,23\n"
                + "24,25,26,27\n"
                + "28,29,30,31";
        
        String set0 = "1,3,5,7\n"
                + "9,11";
        String set1 = "2,3,6,7\n"
                + "10,11";
        String set2 = "4,5,6,7\n"
                + "12";
        String set3 = "8,9,10,11\n"
                + "12";
        
        int result = JOptionPane.showConfirmDialog(null, "if your birth MONTH is"
                + " in this set enter 1 if not enter 0 \n"
                + set0);

        int month = 0;
        if (result == JOptionPane.YES_OPTION) {
            month += 1;
        }

        result = JOptionPane.showConfirmDialog(null, "if your birth MONTH is in this set enter 1 if not enter 0 \n"
                + set1);
        if (result == JOptionPane.YES_OPTION) {
            month += 2;
        }

        result = JOptionPane.showConfirmDialog(null, "if your birth MONTH is in this set enter 1 if not enter 0 \n"
                + set2);
        if (result == JOptionPane.YES_OPTION) {
            month += 4;
        }

        result = JOptionPane.showConfirmDialog(null, "if your birth MONTH is in this set enter 1 if not enter 0 \n"
                + set3);
        
        if (result == JOptionPane.YES_OPTION) {
            month += 8;
        }

        

        //to get the birth day 
        int day = 0;

        result = JOptionPane.showConfirmDialog(null, "if your birth DAY is in this set enter 1 if not enter 0 \n"
                + set00);
        if (result == JOptionPane.YES_OPTION) {
            day += 1;
        }

        result = JOptionPane.showConfirmDialog(null, "if your birth DAY is in this set enter 1 if not enter 0 \n"
                + set01);
        if (result == JOptionPane.YES_OPTION) {
            day += 2;
        }

        result = JOptionPane.showConfirmDialog(null, "if your birth DAY is in this set enter 1 if not enter 0 \n"
                + set02);
        if (result == JOptionPane.YES_OPTION) {
            day += 4;
        }

        result = JOptionPane.showConfirmDialog(null, "if your birth DAY is in this set enter 1 if not enter 0 \n"
                + set03);
        if (result == JOptionPane.YES_OPTION) {
            day += 8;
        }

        result = JOptionPane.showConfirmDialog(null, "if your birth DAY is in this set enter 1 if not enter 0 \n"
                + set04);
        
        if (result == JOptionPane.YES_OPTION) {
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
