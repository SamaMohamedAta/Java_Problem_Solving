package CH02;

import java.util.Scanner;

public class EX02_04 {

    public static void main(String[] args) {
        System.out.println("enter the value for pounds ");
        Scanner input = new Scanner(System.in);
        double pounds = input.nextDouble();
        double kiloGrams;
        kiloGrams = pounds * 0.454;
        System.out.println(pounds + " pound is " + kiloGrams + " kilograms.");
    }
}
