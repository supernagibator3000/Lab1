package Lab12;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GUI extends JFrame {
    String[] planets = {"Не выбрано", "Меркурии", "Венере", "Земле", "Марсе", "Юпитере", "Сатурне", "Уране", "Нептуне"};

    public GUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("Поверхностная гравитация");
        setSize(300, 120);
        setResizable(false);

        JLabel text1 = new JLabel("Поверхностная гравитация на ");
        JComboBox planetSelector = new JComboBox(planets);
        //JLabel text2 = new JLabel(" составляет");
        JLabel gravityLabel = new JLabel();

        planetSelector.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String planet = (String) planetSelector.getSelectedItem();
                switch(planet){
                    default:
                        gravityLabel.setVisible(false);
                        break;
                    case "Меркурии":
                        gravityLabel.setText(String.valueOf("g = " + Planet.MERCURY.getGravity()) + " м/с^2");
                        gravityLabel.setVisible(true);
                        break;
                    case "Венере":
                        gravityLabel.setText(String.valueOf("g = " + Planet.VENUS.getGravity()) + " м/с^2");
                        gravityLabel.setVisible(true);
                        break;
                    case "Земле":
                        gravityLabel.setText(String.valueOf("g = " + Planet.EARTH.getGravity()) + " м/с^2");
                        gravityLabel.setVisible(true);
                        break;
                    case "Марсе":
                        gravityLabel.setText(String.valueOf("g = " + Planet.MARS.getGravity()) + " м/с^2");
                        gravityLabel.setVisible(true);
                        break;
                    case "Юпитере":
                        gravityLabel.setText(String.valueOf("g = " + Planet.JUPITER.getGravity()) + " м/с^2");
                        gravityLabel.setVisible(true);
                        break;
                    case "Сатурне":
                        gravityLabel.setText(String.valueOf("g = " + Planet.SATURN.getGravity()) + " м/с^2");
                        gravityLabel.setVisible(true);
                        break;
                    case "Уране":
                        gravityLabel.setText(String.valueOf("g = " + Planet.URANUS.getGravity()) + " м/с^2");
                        gravityLabel.setVisible(true);
                        break;
                    case "Нептуне":
                        gravityLabel.setText(String.valueOf("g = " + Planet.NEPTUNE.getGravity()) + " м/с^2");
                        gravityLabel.setVisible(true);
                        break;
                }
            }
        });

        text1.setBounds(5, 10, 180, 20);
        planetSelector.setBounds(185, 10, 95, 20);
        //text2.setBounds(280, 10, 75, 20);
        gravityLabel.setBounds(5, 40, 200, 20);

        add(text1);
        add(planetSelector);
        //add(text2);
        add(gravityLabel);

        setVisible(true);
    }
}