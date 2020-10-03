package Lab9.Ex1;

import Lab8.Ex1.Circle;
import Lab8.Ex1.Square;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonShapeCreation extends JFrame{
    private int width = 500, height = 400;
    private int cols = 5, rows = 4;
    private Circle circle;
    private Square square;
    public ButtonShapeCreation(){
        setTitle("Создание фигур");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width + 15, height + 40);
        setResizable(false);

        JPanel panel = new JPanel();

        JButton button = new JButton("PRESS ME");
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                for (int i = 0; i < cols; i++){
                    for (int j = 0; j < rows; j++){
                        switch((int)(Math.random()*2)){
                            case 0:
                                circle = new Circle(i*width/cols,j*height/rows, width/cols - 4,height/rows - 4);
                                add(circle);
                                break;
                            case 1:
                                square = new Square(i*width/cols,j*height/rows, width/cols - 4,height/rows - 4);
                                add(square);
                                break;
                        }
                        setVisible(true);
                    }
                }
            }
        };
        button.addActionListener(actionListener);
        button.setSize(100, 20);
        panel.add(button);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonShapeCreation();
    }
}
