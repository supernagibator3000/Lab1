package Lab5.Ex2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        System.out.println("Круг\nВведите радиус окружности:");
        circle.setRadius(sc.nextDouble());
        System.out.println("Площадь: "+circle.getArea()+"\nПериметр: "+circle.getPerimeter());

        System.out.println("Прямоугольник\nВведите стороны прямоугольника:");
        rectangle.setSideX(sc.nextDouble());
        rectangle.setSideY(sc.nextDouble());
        System.out.println("Площадь: "+rectangle.getArea()+"\nПериметр: "+rectangle.getPerimeter());

        System.out.println("Квадрат\nВведите сторону квадрата:");
        square.setSide(sc.nextDouble());
        System.out.println("Площадь: "+square.getArea()+"\nПериметр: "+square.getPerimeter());
    }
}
