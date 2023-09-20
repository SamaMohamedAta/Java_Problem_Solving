package CH02;

import java.util.Scanner;

public class EX02_14 {

    public static void main(String[] args) {
        System.out.println("Enter weight in pounds: ");
        Scanner input = new Scanner(System.in);
        double pounds = input.nextDouble();
        double kilograms = pounds * 0.45359237;
        System.out.println("Enter height in inches: ");
        int inches = input.nextInt();
        double meters = inches * 0.0254;
        double BMI = kilograms / Math.pow(meters, 2);
        System.out.println("BMI is " + BMI + ".");

    }
}
