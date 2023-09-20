
package CH02;

public class EX02_19 {
    public static void main(String[] args) {
        long num = System.currentTimeMillis();
        num = num % 26;
        num += 63;
        char rec = (char) num;
        System.out.println("The random upperLetter is " + rec);
    }
    
}
