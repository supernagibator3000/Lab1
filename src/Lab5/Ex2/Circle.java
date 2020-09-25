package Lab5.Ex2;

public class Circle extends Shape{
    private double radius;

    @Override
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
}
