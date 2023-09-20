package CH03;

import java.util.Scanner;

public class EX03_01 {

    public static void main(String[] args) {
        System.out.println("Enter a, b, c: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant > 0) {
            double ans1 = (-1 * b + Math.pow(discriminant, 0.5)) / (2 * a);
            double ans2 = (-1 * b - Math.pow(discriminant, 0.5)) / (2 * a);

            System.out.printf("The roots are %.6f and %.5f " , ans1, ans2);
        } else if (discriminant == 0) {
            double ans = (-1 * b) / (2 * a);
            System.out.println("The root is " + ans);
        } else {
            System.out.println("The equation has no real roots");
        }
    }

}
