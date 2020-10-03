package Lab7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        FurnitureShop shop = new FurnitureShop();

        int in = 0;
        System.out.print("Введите количество добавляемых стульев: ");
        in = sc.nextInt();
        for (int i = 0; i < in; i++)
            person.addChair(shop.chair);

        System.out.print("Введите количество добавляемых диванов: ");
        in = sc.nextInt();
        for (int i = 0; i < in; i++)
            person.addSofa(shop.sofa);

        System.out.print("Введите количество добавляемых столов: ");
        in = sc.nextInt();
        for (int i = 0; i < in; i++)
            person.addTable(shop.table);

        person.outCart();
    }
}
