package CH03;

import java.util.Scanner;

public class GUESSING_BIRTHDAY_03 {

    public static void main(String[] args) {
     

        String set00 = "1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31";
        String set01 = "2,3,6,7,10,11,14,15,18,19,22,23,26,27,30,31";
        String set02 = "4,5,6,7,12,13,14,15,20,21,22,23,28,29,30,31";
        String set03 = "8,9,10,11,12,13,14,15,24,25,26,27,28,29,30,31";
        String set04 = "16,17,28,19,20,21,22,23,24,25,26,27,28,29,30,31";
        Scanner input = new Scanner(System.in);
        System.out.print("if your birth MONTH is in this set " + set00 + 
                "\nEnter 1 for yes and 0 for no : ");
        int result = input.nextInt();
        int month = 0;
        if (result == 1) {
            month += 1;
        }

        System.out.print("if your birth MONTH is in this set " + set01 + 
                "\nEnter 1 for yes and 0 for no : ");
        
        result = input.nextInt();
        if (result == 1) {
            month += 2;
        }

        System.out.print("if your birth MONTH is in this set " + set02 + 
                "\nEnter 1 for yes and 0 for no : ");
        result = input.nextInt();
        if (result == 1) {
            month += 4;
        }

        System.out.print("if your birth MONTH is in this set " + set03 + 
                "\nEnter 1 for yes and 0 for no : ");
        result = input.nextInt();
        if (result == 1) {
            month += 8;
        }

        System.out.print("if your birth MONTH is in this set " + set04 + 
                "\nEnter 1 for yes and 0 for no : ");
        result = input.nextInt();
        if (result == 1) {
            month += 16;
        }
        //to get the birth day 

        int day = 0;

        System.out.print("if your birth DAY is in this set " + set00 + 
                "\nEnter 1 for yes and 0 for no : ");
        result = input.nextInt();
        if (result == 1) {
            day += 1;
        }

        System.out.print("if your birth DAY is in this set " + set01 + 
                "\nEnter 1 for yes and 0 for no : ");
        result = input.nextInt();
        if (result == 1) {
            day += 2;
        }

        System.out.print("if your birth DAY is in this set \n" + set02 + 
                "\nEnter 1 for yes and 0 for no : ");
        result = input.nextInt();
        if (result == 1) {
            day += 4;
        }
        
        System.out.print("if your birth DAY is in this set \n" + set03 + 
                "\nEnter 1 for yes and 0 for no : ");
        result = input.nextInt();
        if (result == 1) {
            day += 8;
        }
        
        System.out.print("if your birth DAY is in this set /n" + set04 + 
                "\nEnter 1 for yes and 0 for no : ");
        result = input.nextInt();
        if (result == 1) {
            day += 16;
        }

        //  System.out.println("Your birth month is "+ month +".");
        switch (month) {
            case 1:
                System.out.println("You born in " + day + " January.");
                break;
            case 2:
                System.out.println("You born in " + day + " February.");
                break;
            case 3:
                System.out.println("You born in " + day + "  March.");
                break;
            case 4:
                System.out.println("You born in " + day + " April.");
                break;
            case 5:
                System.out.println("You born in " + day + " May.");
                break;
            case 6:
                System.out.println("You born in " + day + " June.");
                break;
            case 7:
                System.out.println("You born in " + day + " July.");
                break;
            case 8:
                System.out.println("You born in " + day + " August.");
                break;
            case 9:
                System.out.println("You born in " + day + " September.");
                break;
            case 10:
                System.out.println("You born in " + day + " October.");
                break;
            case 11:
                System.out.println("You born in " + day + " November.");
                break;
            case 12:
                System.out.println("You born in " + day + " December.");
                break;
        }
    }
}
