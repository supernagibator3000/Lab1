package Lab7;

import java.util.ArrayList;

public class Person {
    private ArrayList<Chair> chairs = new ArrayList<Chair>();
    private ArrayList<Sofa>sofas = new ArrayList<Sofa>();
    private ArrayList<Table>tables = new ArrayList<Table>();
    private int totalPrice;

    public void addChair(Chair chair){
        chairs.add(chair);
        totalPrice += chair.getPrice();
    }
    public void addSofa(Sofa sofa){
        sofas.add(sofa);
        totalPrice += sofa.getPrice();
    }
    public void addTable(Table table){
        tables.add(table);
        totalPrice += table.getPrice();
    }

    public void outCart(){
        System.out.println("=== Корзина ===\nСтулья: " + chairs.size() + " штук\n"
                + "Диваны: " + sofas.size() + " штук\n"
                + "Столы: " + tables.size() + " штук\n"
        + "Итог: " + totalPrice);
    }
}
