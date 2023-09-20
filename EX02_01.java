package CH02;

import java.util.*;

public class EX02_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the degree in celsius");
        double theCelsius = input.nextDouble();

        double thefahrenheit = (9.0 / 5) * theCelsius + 32;
        System.out.println("The no in fehrenhiet is " + thefahrenheit);
    }

}
