package CH03;

public class EX03_16 {

    public static void main(String[] args) {
        int x = (int) (Math.random() * 100);
        int rec = x % 26;
        rec += 65;
        char letter = (char) rec;
        System.out.println(letter);
    }
}
