package Lab2.Ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class KennelDog
{
    public static ArrayList<Dog>dogs = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        addDog();
        System.out.println("Информация о собаках");
        for(Dog info: dogs)
            System.out.println(info.toString());
    }
    public static void addDog()
    {
        int required = 0;
        System.out.print("Сколько собак добавить? ");
        required = sc.nextInt();
        System.out.println("Введите информацию о собаках (кличка, возраст)");
        for (int i = 0; i < required; i++)
            dogs.add(new Dog(sc.next(), sc.nextInt()));
    }
}
