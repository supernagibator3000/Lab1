package Lab4.Ex1;

public class Square
{
    double side, area, perimeter;

    public Square(double side) {
        this.side = side;
        setArea();
        setPerimeter();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        setArea();
        setPerimeter();
    }

    public double getArea() {
        return area;
    }

    public void setArea() {
        this.area = side*side;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter() {
        this.perimeter = 4*side;
    }
}