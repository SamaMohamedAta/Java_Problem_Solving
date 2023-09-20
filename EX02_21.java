package CH02;

import java.util.Scanner;

public class EX02_21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter x1 and y1: ");
        System.out.println("Enter three points for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        //System.out.println("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        //System.out.println("Enter x3 and y3: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double a = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        double side1 = Math.pow(a, 0.5);
        double b = Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2);
        double side2 = Math.pow(b, 0.5);
        double c = Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2);
        double side3 = Math.pow(c, 0.5);

        double s = (side1 + side2 + side3) / 2;
        double var = s * (s - side1) * (s - side2) * (s - side3);
        double area = Math.pow(var, 0.5);

        System.out.println("The area of the triangle is " + area);

    }

}
