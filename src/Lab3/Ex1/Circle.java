package Lab3.Ex1;

public class Circle
{
    private double r, l;

    public double getL()
    {
        return l;
    }

    public double getR()
    {
        return r;
    }

    public void setR(double r)
    {
        this.r = r;
        l = 2*Math.PI*r;
    }


}
