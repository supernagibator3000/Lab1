package Lab7;

import java.util.List;

public class Person {
    private List<Chair>chairs;
    private List<Sofa>sofas;
    private List<Table>tables;
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
        System.out.println("Корзина\nСтулья: " + chairs.size() + " штук\n"
                + "Диваны: " + sofas.size() + " штук\n"
                + "Столы: " + tables.size() + " штук\n"
        + "Итог: " + totalPrice);
    }
}
