
package CH03;

import java.util.Scanner;

public class EX03_23 {
    public static void main(String[] args) {
        System.out.println("Enter a point with two coordinates: ");
        Scanner input = new Scanner(System.in);
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        //double inV = Math.pow(x1,2)+Math.pow(y1, 2);
        //double distance1 = Math.pow(in,0.5);
        if(x1<=10/2 && y1<=5/2){
            System.out.println("The point (" + x1 + " , " + y1 + ") is in the rectangle.");
        } else 
            System.out.println("The point (" + x1 + " , " + y1 + ") is not in the rectangle.");
    }
}
