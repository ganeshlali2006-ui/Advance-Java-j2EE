package basics;

import java.awt.Color;
import javax.swing.*;

public class TabbedPaneExample {

    public static void main(String[] args) {

        JFrame f = new JFrame("Tabbed Pane Example");

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.setBackground(Color.BLUE);
        p2.setBackground(Color.RED);
        p3.setBackground(Color.GREEN);

        JTabbedPane tp = new JTabbedPane();
        tp.add("BLUE", p1);
        tp.add("RED", p2);
        tp.add("GREEN", p3);

        f.add(tp);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}