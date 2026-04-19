package basics;


import javax.swing.*;
import java.util.HashMap;

public class CountryCapitalList extends JFrame {

    public CountryCapitalList() {

        String[] countries = {
                "USA", "India", "Vietnam", "Canada", "Denmark",
                "France", "Great Britain", "Japan",
                "Africa", "Greenland", "Singapore"
        };

        HashMap<String, String> map = new HashMap<>();

        map.put("USA", "Washington D.C.");
        map.put("India", "New Delhi");
        map.put("Vietnam", "Hanoi");
        map.put("Canada", "Ottawa");
        map.put("Denmark", "Copenhagen");
        map.put("France", "Paris");
        map.put("Great Britain", "London");
        map.put("Japan", "Tokyo");
        map.put("Africa", "Addis Ababa");
        map.put("Greenland", "Nuuk");
        map.put("Singapore", "Singapore");

        JList<String> list = new JList<>(countries);

        list.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String selected = list.getSelectedValue();
                System.out.println("Capital of " + selected + " is: " + map.get(selected));
            }
        });

        add(new JScrollPane(list));

        setTitle("Country Capitals");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalList();
    }
}