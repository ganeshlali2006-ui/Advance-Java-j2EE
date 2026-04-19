package Swings;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonExample {

    public static void main(String[] args) {

        JFrame f = new JFrame("Image Button Example");
        f.setSize(400, 300);
        f.setLayout(null);

        JLabel label = new JLabel();
        label.setBounds(50, 20, 300, 30);
        label.setFont(new Font("Arial", Font.BOLD, 16));

        // Load images (place images inside project folder)
        ImageIcon digitalIcon = new ImageIcon("digitalclock.png");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

        JButton b1 = new JButton("Digital Clock", digitalIcon);
        JButton b2 = new JButton("Hour Glass", hourglassIcon);

        b1.setBounds(50, 80, 150, 80);
        b2.setBounds(220, 80, 150, 80);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        f.add(label);
        f.add(b1);
        f.add(b2);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}