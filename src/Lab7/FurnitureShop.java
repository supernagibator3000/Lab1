package Lab7;

public class FurnitureShop
{
    public Sofa sofa = new Sofa();
    public Table table = new Table();
    public Chair chair = new Chair();
    public FurnitureShop()
    {
        sofa.setPrice(100);
        table.setPrice(50);
        chair.setPrice(25);
    }
}