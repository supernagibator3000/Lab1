package Lab6.Ex1;

public class MovablePoints implements Movable{
    private int x, y, prevX, prevY;
    @Override
    public void move(int x, int y) {
        prevX = this.x;
        prevY = this.y;
        this.x = prevX + x;
        this.y = prevY + y;
    }

    @Override
    public boolean speedCheck() {
        return false;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getPrevX() {
        return prevX;
    }

    public int getPrevY() {
        return prevY;
    }
}
