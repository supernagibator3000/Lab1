package Lab22.Ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Shop {
    private final ArrayList<Customer> users;
    private HashMap<String, Double> items;

    public void addItem(String itemName, Double itemPrice) {
        items.putIfAbsent(itemName, itemPrice);
    }

    public boolean addUser(Customer newCustomer) {
        return !users.contains(newCustomer) && users.add(newCustomer);
    }

    public void printUsers(){
        if (users.isEmpty())
            System.out.println("Нет зарегистрированных пользователей");

        else {
            System.out.println("Список зарегистрированных пользователи:");
            for (Customer user : users)
                System.out.println(user.getFullName() + "    " + user.getTIN());

            System.out.println("----------------------------------------------");
        }
    }

    public void printItems() {
        if (items.isEmpty())
            System.out.println("Склад магазина пуст");

        else {
            System.out.println("Товары в наличии:\nПредмет\tЦена");
            for (Map.Entry<String, Double> pair : items.entrySet())
                System.out.println(pair.getKey() + '\t' + pair.getValue());

            System.out.println("----------------------------------------------");
        }
    }

    private Map.Entry<String, Double> getItem(String itemName){
        for (Map.Entry<String, Double> pair: items.entrySet())
            if (pair.getKey().equals(itemName))
                return pair;

        return null;
    }

    public String addToCart(String fullName, String TIN, String itemName, Integer quantity){
        try {
            Customer user = null;
            for (Customer userBuff: users)
                if (userBuff.getFullName().equals(fullName)){
                    user = userBuff;
                    break;
                }

            if (!user.getTIN().equals(TIN))
                throw new MyExeption();

            else {
                Map.Entry<String, Double> item = getItem(itemName);
                if (item == null || quantity < 1)
                    return "Невозможно добавить товар " + itemName + "\n----------------------------------------------";

                else {
                    user.addToCart(item, quantity);
                    return "Товар " + itemName + " успешно добавлен" + "\n----------------------------------------------";
                }
            }
        }
        catch (MyExeption e){
            System.out.println(e.getMessage());
            return "Невозможно добавить товар " + itemName + "\n----------------------------------------------";
        }
    }

    public String showCart(String fullName, String TIN){
        try{
            Customer user = null;
            for (Customer userBuff: users)
                if (userBuff.getFullName().equals(fullName)){
                    user = userBuff;
                    break;
                }

            if (!user.getTIN().equals(TIN))
                throw new MyExeption();

            else
                return user.getCart() + "----------------------------------------------";
        }
        catch (MyExeption e){
            System.out.println(e.getMessage());
            return "Невозможно открыть корзину пользователя " + fullName + "\n----------------------------------------------";
        }
    }

    public Shop(){
        users = new ArrayList<>();
        items = new HashMap<>();
    }
}
