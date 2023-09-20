
package CH03;

import javax.swing.JOptionPane;

public class EX03_16_GUI {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 100);
        int rec = x%26;
        rec+=65;
        char letter = (char)rec;
        JOptionPane.showMessageDialog(null, letter);
    }

}
