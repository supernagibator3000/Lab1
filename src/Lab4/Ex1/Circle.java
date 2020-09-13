package Lab4.Ex1;

public class Circle
{
    private double radius, area, perimeter;

    public Circle(double radius){
        this.radius = radius;
        setPerimeter();
        setArea();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        setArea();
        setPerimeter();
    }

    public double getArea() {
        return area;
    }

    public void setArea() {
        this.area = Math.PI*Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter() {
        this.perimeter = 2*Math.PI*radius;
    }
}