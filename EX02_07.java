package CH02;

import java.util.Scanner;

public class EX02_07 {

    public static void main(String[] args) {
        System.out.println("Enter the number of minutes");
        Scanner s1 = new Scanner(System.in);
        int minutes = s1.nextInt();
        int hours = minutes / 60;
        int days = hours / 24;
        int remainingDays = days % 365;
        int years = days / 365;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days.");
    }
}
