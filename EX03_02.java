
package CH03;

import java.util.Scanner;

public class EX03_02 {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Is " + num + " an even number? " + (num % 2 == 0));
        

    }
}
