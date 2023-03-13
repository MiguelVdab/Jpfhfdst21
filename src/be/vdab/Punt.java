package be.vdab;

import java.io.Serializable;

public class Punt implements Serializable {
    private final int x;
    private final int y;
    private static final long serialVersionUID = 1L;
    public Punt(int x , int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return x + " - " + y;
    }
}
