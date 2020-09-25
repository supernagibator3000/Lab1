package Lab7;

import java.util.Scanner;

public class FurnitureShop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Sofa sofa = new Sofa();
        Table table = new Table();
        Chair chair = new Chair();

        sofa.setPrice(100);
        table.setPrice(50);
        chair.setPrice(25);

        Person person = new Person();

        int in = 0;
        System.out.print("Введите количество добавляемых стульев: ");
        in = sc.nextInt();
        for (int i = 0; i < in; i++)
            person.addChair(chair);

        System.out.print("Введите количество добавляемых диванов: ");
        in = sc.nextInt();
        for (int i = 0; i < in; i++)
            person.addSofa(sofa);

        System.out.print("Введите количество добавляемых столов: ");
        in = sc.nextInt();
        for (int i = 0; i < in; i++)
            person.addTable(table);

        person.outCart();
    }
}