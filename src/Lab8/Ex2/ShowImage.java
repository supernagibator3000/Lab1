package Lab8.Ex2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ShowImage extends JFrame {
    public ShowImage(String path){
        setTitle("Вывод изображения");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setResizable(false);
        setVisible(true);

        Graphics g;
        Image img;

        img = new ImageIcon(path).getImage();

        g = getGraphics();
        g.drawImage(img, 0, 0, 500, 500, null);
    }

    public static void main(String[] args) {
        System.out.println("Введите путь к искомому изображению");
        String path = new String();
        Scanner sc = new Scanner(System.in);
        path = sc.nextLine();
        new ShowImage(path);
    }
}
