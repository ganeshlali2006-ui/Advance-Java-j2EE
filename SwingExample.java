package Swings;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

class SwingExample {

    SwingExample() {

        JFrame jfrm = new JFrame("A Simple Swing Application");

        jfrm.setSize(600, 200);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlab = new JLabel("Hello! VI C , Welcome to Swing Programming!");

        jlab.setFont(new Font("Verdana", Font.PLAIN, 32));
        jlab.setForeground(Color.BLUE);
        jlab.setHorizontalAlignment(JLabel.CENTER);

        jfrm.add(jlab);

        jfrm.setVisible(true);
    }

    public static void main(String args[]) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingExample();
            }
        });
    }
}