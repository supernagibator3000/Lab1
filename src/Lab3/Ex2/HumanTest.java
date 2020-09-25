package Lab3.Ex2;

import java.util.Scanner;

public class HumanTest {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите имя человека: ");

        Human human = new Human(sc.nextLine(), true);

        if (human.isExist()) {
            System.out.println("Человек по имени " + human.getName() + " существует");
        } else {
            System.out.println("Человек по имени " + human.getName() + " не существует");
        }

        if (human.isHealth()) {
            System.out.println("Человек по имени " + human.getName() + " здоров");
        } else {
            System.out.println("Человек по имени " + human.getName() + " не здоров");
        }

        System.out.println("!!!Происшествие!!!");

        switch ((int)(Math.random()*5))
        {
            case 0:
                human.head.setExist(false);
                break;
            case 1:
                human.legLeft.setExist(false);
                break;
            case 2:
                human.legRight.setExist(false);
                break;
            case 3:
                human.handLeft.setExist(false);
                break;
            case 4:
                human.handRight.setExist(false);
                break;
        }

        System.out.println("С человеком по имени " + human.getName() + " что-то произошло и он потерял:" + human.healthInfo());

        if (human.isExist()) {
            System.out.print("Человек по имени " + human.getName() + " существует и не здоров");
        } else {
            System.out.println("Человек по имени " + human.getName() + " не существует");
        }
    }
}
