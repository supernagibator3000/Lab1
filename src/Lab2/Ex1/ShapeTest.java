package Lab2.Ex1;

import java.util.Scanner;

public class ShapeTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();

        System.out.print("Введите название фигуры: ");
        shape.setName(sc.nextLine());

        System.out.print("Введите периметр фигуры: ");
        shape.setP(sc.nextInt());

        System.out.println("Название фигуры: " + shape.getName());
        System.out.println("Периметр фигуры: " + shape.getP());
    }
}
