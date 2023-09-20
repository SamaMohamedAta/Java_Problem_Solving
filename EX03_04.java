
package CH03;

import java.util.Scanner;

public class EX03_04 {
    public static void main(String[] args) {
        int x = (int) ((double) Math.random() * 100);
        int y = (int) ((double) Math.random() * 100 + 1);
        System.out.println("Enter the sum of " + x + " + " + y);
        Scanner input = new Scanner(System.in);
        int result = input.nextInt();
        if (x + y == result) {
            System.out.println("Your answer is true. ");
        } else {
            System.out.println("Your answer is False. ");
        }
    }
 
}
