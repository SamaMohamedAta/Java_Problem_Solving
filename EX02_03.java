package CH02;

import java.util.Scanner;

public class EX02_03 {

    public static void main(String[] args) {
        System.out.println("enter the value for feet ");
        Scanner input = new Scanner(System.in);
        double feet = input.nextDouble();
        double meter;
        meter = feet * 0.305;
        System.out.println(feet + " feet is " + meter + " meter.");
    }
}
