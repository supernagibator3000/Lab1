package Lab8.Ex1;

import javax.swing.*;

public class ShapeCreation extends JFrame {
    public ShapeCreation(){
        setTitle("Создание фигур");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);



        setResizable(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ShapeCreation();
    }
}
