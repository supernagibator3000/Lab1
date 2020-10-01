package Lab8.Ex1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ShapeCreation extends JFrame {
    public ShapeCreation(){
        setTitle("Создание фигур");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Circle circle;
        Square square;

        int width = 500;
        int height = 400;
        setSize(width + 15, height + 40);

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 4; j++){
                switch((int)(Math.random()*2)){
                    case 0:
                        circle = new Circle(i*width/5,j*height/4, width/5 - 4,height/4 - 4);
                        add(circle);
                        break;
                    case 1:
                        square = new Square(i*width/5,j*height/4, width/5 - 4,height/4 - 4);
                        add(square);
                        break;
                }
                setVisible(true);
            }
        }
        setResizable(false);
    }

    public static void main(String[] args) {
        new ShapeCreation();
    }
}
