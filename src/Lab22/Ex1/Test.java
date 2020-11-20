package Lab22.Ex1;

public class Test {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.addItem("стол", 1999.99);
        shop.addItem("диван", 5000.00);
        shop.addItem("стул", 999.99);

        shop.printItems();

        shop.addUser(new Customer("Толстой Лев", "000000000000"));
        shop.addUser(new Customer("Туогенев Иван", "111111111111"));

        Customer customer = new Customer("Буланов Владимир", "222222222222");
        shop.addUser(customer);

        shop.printUsers();

        System.out.println(shop.addToCart("Буланов Владимир", "000000000000", "стол", 1));
        System.out.println(shop.addToCart("Буланов Владимир", "222222222222", "стол", 1));

        System.out.println(shop.showCart("Буланов Владимир", "000000000000"));
        System.out.println(shop.showCart("Буланов Владимир", "222222222222"));
    }
}
