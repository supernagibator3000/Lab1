package Lab7;

public class Sofa extends Furniture
{
    @Override
    int getPrice()
    {
        return price;
    }
    @Override
    int getAmount()
    {
        return amount;
    }
    @Override
    void setPrice(int price)
    {
        this.price = price;
    }
    @Override
    void setAmount(int amount)
    {
        this.amount = amount;
    }
}