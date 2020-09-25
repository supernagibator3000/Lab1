package Lab3.Ex2;

public class Human
{
    String name;
    boolean exist, health;
    Head head;
    Hand handLeft, handRight;
    Leg legLeft, legRight;

    public Human(String name, boolean health) {
        this.name = name;
        this.exist = true;
        this.health = health;

        head = new Head(this,true);
        handRight = new Hand(this,true);
        handLeft = new Hand(this,true);
        legRight = new Leg(this,true);
        legLeft = new Leg(this,true);
    }

    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }

    public boolean isHealth() {
        return health;
    }

    public void setHealth(boolean health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String healthInfo()
    {
        String info = "ничего";
        if (!head.getExist())
            info = " голова";
        if (!legLeft.getExist())
            info =" левая нога";
        if (!legRight.getExist())
            info =" правая нога";
        if (!handLeft.getExist())
            info =" левая рука";
        if (!handRight.getExist())
            info =" правая рука";
        return info;
    }
}