package Lab6.Ex1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int in1, in2;
        Scanner sc = new Scanner(System.in);
        MovableRectangle movableRectangle = new MovableRectangle();
        System.out.println("Введите длины сторон прямоугольника (x, y): ");
        in1 = sc.nextInt();
        in2  = sc.nextInt();
        movableRectangle.setSideX(in1);
        movableRectangle.setSideY(in2);
        System.out.println("Введите начальные координаты левой верхней точки прямоугольника (x, y): ");
        in1 = sc.nextInt();
        in2  = sc.nextInt();
        movableRectangle.setTopLeft(in1, in2);
        System.out.println("Изначальные координаты точек прямоугольника");
        movableRectangle.getTopLeft();
        movableRectangle.getBottomRight();
        System.out.println("Введите вектор перемещения прямоугольника (x, y): ");
        in1 = sc.nextInt();
        in2  = sc.nextInt();
        movableRectangle.move(in1, in2);
        System.out.println("Новые координаты");
        movableRectangle.getTopLeft();
        movableRectangle.getBottomRight();
    }
}
