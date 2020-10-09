package Lab11.Ex1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private int trials = 0;
    private int width = 250;
    private int height = 200;
    public Main(){
        JButton button = new JButton("Проверить");
        JTextField textField = new JTextField();

        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width,height);

        textField.setBounds(width/4,height/10 + 10,width/2,20);
        button.setBounds(width/4,height/2 - 20,width/2,20);
        add(textField);
        add(button);

        int number = (int)(Math.random()*21);
        // Для теста
        System.out.println(number);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                boolean check = false;
                int inputNumber = Integer.parseInt(textField.getText());
                trials++;
                if (inputNumber == number) {
                    check = true;
                    JOptionPane.showMessageDialog(null, "Вы угадали");
                    setVisible(false);
                    dispose();
                }
                else if (inputNumber < number){
                    textField.setText("");
                    JOptionPane.showMessageDialog(null,"Надо больше\nОсталось попыток: " + (3 - trials));
                }
                else {
                    textField.setText("");
                    JOptionPane.showMessageDialog(null,"Надо меньше\nОсталось попыток: " + (3 - trials));
                }
                if (trials == 3 && !check){
                    JOptionPane.showMessageDialog(null,"Попытки кончились");
                    remove(button);
                    remove(textField);
                    setVisible(false);
                    dispose();
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}