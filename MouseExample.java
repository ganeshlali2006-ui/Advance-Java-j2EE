package Swings;



import javax.swing.*;
import java.awt.event.*;

public class MouseExample {

    public static void main(String[] args) {

        JFrame f = new JFrame("Mouse Events");
        JButton btn = new JButton("Click Me");

        btn.setBounds(100, 100, 150, 50);

        btn.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    System.out.println("Double Click");
                } else {
                    System.out.println("Single Click");
                }
            }

            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse Pressed");
            }

            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse Released");
            }

            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });

        f.add(btn);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}