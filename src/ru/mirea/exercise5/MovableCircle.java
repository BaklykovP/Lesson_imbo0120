package ru.mirea.exercise5;

public class MovableCircle extends Point implements Movable {

    public MovableCircle(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int x, int y) {
        this.setX(getX() + x);
        this.setY(getY() + y);
    }
}
