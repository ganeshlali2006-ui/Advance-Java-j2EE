package basics;


import java.util.List;
import javax.swing.*;

public class JListExample extends JFrame {

    private JList<String> countryList;

    public JListExample() {

        DefaultListModel<String> listModel = new DefaultListModel<>();

        listModel.addElement("USA");
        listModel.addElement("India");
        listModel.addElement("Vietnam");
        listModel.addElement("Canada");
        listModel.addElement("Denmark");
        listModel.addElement("France");
        listModel.addElement("Great Britain");
        listModel.addElement("Japan");
        listModel.addElement("Africa");
        listModel.addElement("Greenland");
        listModel.addElement("Singapore");

        countryList = new JList<>(listModel);

        countryList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                List<String> selected = countryList.getSelectedValuesList();
                System.out.println(selected);
            }
        });

        add(new JScrollPane(countryList));

        setTitle("JList Example");
        setSize(250, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JListExample();
    }
}