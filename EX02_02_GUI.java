/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CH02;

import javax.swing.JOptionPane;

/**
 *
 * @author Sama
 */
public class EX02_02_GUI {

    public static void main(String[] args) {

        String stringTheRadius = JOptionPane.showInputDialog(null, "Enter the radius of a cylinder: ");
        String stringTheLength = JOptionPane.showInputDialog(null, "Enter the length of a cylinder: ");

        double radius = Double.parseDouble(stringTheRadius);
        double length = Double.parseDouble(stringTheLength);

        double area = radius * radius * Math.PI;
        double volume = area * length;
        JOptionPane.showMessageDialog(null, "the area is " + area);
        JOptionPane.showMessageDialog(null, "the volume is " + volume);
        // another way
        //JOptionPane.showMessageDialog(null,"the area is " + area +"the volume is " + volume);
    }
}
