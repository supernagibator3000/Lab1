package Lab3.Ex1;

import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Circle circle = new Circle();

        System.out.print("Введите радиус: ");
        circle.setR(sc.nextDouble());

        System.out.println("Длина окружности: " + circle.getL());

        System.out.print("Введите новый радиус: ");
        circle.setR(sc.nextDouble());

        System.out.print("Новый радиус: " + circle.getR());
    }
}
