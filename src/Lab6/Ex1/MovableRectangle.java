package Lab6.Ex1;
import Lab5.Ex2.Rectangle;

public class MovableRectangle extends Rectangle implements Movable{
    private MovablePoints topLeft = new MovablePoints();
    private MovablePoints bottomRight = new MovablePoints();
    @Override
    public void move(int x, int y) {
        topLeft.move(x, y);
        bottomRight.move(x, y);
    }

    public void getTopLeft() {
        System.out.println("Крайняя левая верхняя точка:\nx = " + this.topLeft.getX() + " y = " + this.topLeft.getY());

    }

    public void setTopLeft(int x, int y) {
        this.topLeft.setX(x);
        this.topLeft.setY(y);
        this.setBottomRight(x, y);
    }

    public void getBottomRight() {
        System.out.println("Крайняя правая нижняя точка:\nx = " + this.bottomRight.getX() + " y = " + this.bottomRight.getY());
    }

    public void setBottomRight(int x, int y) {
        this.bottomRight.setX(x + (int)getSideX());
        this.bottomRight.setY(y + (int)getSideY());
    }

    @Override
    public boolean speedCheck() {
        return false;
    }
}
