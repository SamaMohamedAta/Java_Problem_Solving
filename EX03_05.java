package CH03;

import java.util.Scanner;

public class EX03_05 {

    public static void main(String[] args) {
        int x = (int) ((double) Math.random() * 100);
        int y = (int) ((double) Math.random() * 100 + 1);
        int z = (int) ((double) Math.random() * 100 + 2);
        System.out.println("Enter the sum of " + x + " + " + y + " + " + z);
        Scanner input = new Scanner(System.in);
        int result = input.nextInt();
        if (x + y + z == result) {
            System.out.println("Your answer is true. ");
        } else {
            System.out.println("Your answer is False. ");
        }
    }
}
