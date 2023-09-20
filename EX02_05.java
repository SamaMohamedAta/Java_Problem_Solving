package CH02;

import java.util.Scanner;

public class EX02_05 {

    public static void main(String[] args) {
        System.out.println("enter the subtotal and gratuity ");
        Scanner input = new Scanner(System.in);
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();
        gratuity = subtotal * gratuity / 100;
        double total = subtotal + gratuity;
        System.out.println("the gratuity is " + gratuity + " and total is " + total + ".");
    }
}
