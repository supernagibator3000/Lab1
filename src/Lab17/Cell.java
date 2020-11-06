package Lab17;

import javax.swing.*;

public class Cell {
    private int x;
    private int y;
    private int state;
    private boolean hidden;
    private boolean marked;

    public Cell(int x, int y, double state){
        this.x = x;
        this.y = y;

        if (state < 0.5)
            this.state = 0;
        else
            this.state = -1;

        hidden = true;
        marked = false;
    }

    public void setState(int state){
        if (this.state == 0)
            this.state = state;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getState(){
        return state;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public boolean isMarked() {
        return marked;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }
}
