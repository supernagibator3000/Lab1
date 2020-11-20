package Lab22.Ex1;

import java.util.HashMap;
import java.util.Map;

public class Customer {
    private String TIN;
    private String fullName;
    private HashMap<Map.Entry<String, Double>, Integer> cart;

    public Customer(String fullName, String TIN) {
        cart = new HashMap<>();
        this.TIN = TIN;
        this.fullName = fullName;
    }

    public void addToCart(Map.Entry<String, Double> item, Integer quantity) {
        cart.computeIfPresent(item, (k, v) -> v + quantity);
        cart.putIfAbsent(item, 1);
    }

    public String getTIN() {
        return TIN;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCart() {
        if (cart.isEmpty())
            return ("Корзина пользователя " + fullName + "пуста\n");

        else {
            String buff = "Корзина пользователя " + fullName + ":\nПредмет\tЦена\tКоличество\n";

            for (Map.Entry<Map.Entry<String, Double>, Integer> pair : cart.entrySet())
                buff += pair.getKey().getKey() + '\t' + pair.getKey().getValue() + '\t' + pair.getValue() + '\n';

            return buff;
        }
    }

    public boolean removeFromCart(Map.Entry<String, Double> item) {
        if (cart.containsKey(item)) {
            cart.remove(item);
            return true;
        }
        return false;
    }
}
