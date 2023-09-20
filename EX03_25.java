package CH03;

import java.util.Scanner;

public class EX03_25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double e1 = input.nextDouble();
        double e2 = input.nextDouble();
        double e3 = input.nextDouble();
        double per = e1 + e2 + e3;
        if (((e1 + e2) > e3) && ((e1 + e3) > e2) && ((e2 + e3) > e1)) {
            System.out.println("The perimeter of the Triangle is " + per);
        } else {
            System.out.println("the input is invalid !");
        }
    }
}
