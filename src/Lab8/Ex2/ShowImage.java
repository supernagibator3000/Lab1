package Lab8.Ex2;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class ShowImage extends JFrame {
    public ShowImage(String path){
        int width = 500;
        int height = 500;
        setTitle("Вывод изображения");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        setResizable(false);
        setVisible(true);

        Graphics g;
        Image img;

        img = new ImageIcon(path).getImage();

        g = getGraphics();
        g.drawImage(img, 0, 0, width, height, null);
    }

    public static void main(String[] args) {
        System.out.println("Введите путь к искомому изображению");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        new ShowImage(path);
    }
}
