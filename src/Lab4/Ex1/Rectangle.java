package Lab4.Ex1;

public class Rectangle
{
    double side1, side2, perimeter, area;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
        setArea();
        setPerimeter();
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
        setArea();
        setPerimeter();
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2() {
        this.side2 = side2;
        setArea();
        setPerimeter();
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter() {
        this.perimeter = 2*(side1+side2);
    }

    public double getArea() {
        return area;
    }

    public void setArea() {
        this.area = side1*side2;
    }
}