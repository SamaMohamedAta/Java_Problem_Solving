package CH02;

import java.util.Scanner;

public class EX02_06 {

    public static void main(String[] args) {
        System.out.println("Enter a number between 0 and 1000: ");
        Scanner input = new Scanner(System.in);
        int thenum1 = input.nextInt();
        int sum;
        sum = thenum1 % 10;
        thenum1 = thenum1 / 10;
        sum += thenum1 % 10;
        thenum1 = thenum1 / 10;
        sum += thenum1 % 10;
        System.out.println("The sum of the digits is " + sum + ".");

    }
}
