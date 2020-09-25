package Lab5.Ex2;

public class Rectangle extends Shape{
    private double sideX, sideY;

    @Override
    public double getArea(){
        return sideX*sideY;
    }

    @Override
    public double getPerimeter(){
        return 2*(sideX+sideY);
    }

    public double getSideX() {
        return sideX;
    }

    public void setSideX(double sideX) {
        this.sideX = sideX;
    }

    public double getSideY() {
        return sideY;
    }

    public void setSideY(double sideY) {
        this.sideY = sideY;
    }
}
