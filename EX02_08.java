package CH02;

import java.util.Scanner;

public class EX02_08 {

    public static void main(String[] args) {
        System.out.println("Enter an ASCII code: ");
        Scanner s1 = new Scanner(System.in);
        int ascci = s1.nextInt();
        char rec = (char) ascci;
        System.out.println("The character for ASCII code " + ascci + " is " + rec + ".");

    }
}
