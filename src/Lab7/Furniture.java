package Lab7;

public abstract class Furniture
{
    int price, amount;
    abstract int getPrice();
    abstract int getAmount();
    abstract void setPrice(int price);
    abstract void setAmount(int amount);
}
