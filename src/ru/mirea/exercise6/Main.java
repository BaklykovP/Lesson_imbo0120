package ru.mirea.exercise6;

public class Main {

    public static void main(String[] args) {

        // Rectangle movement
        Rectangle rectangle = new Rectangle(new Point(0,1), new Point(2,0));
        System.out.println(rectangle);
        System.out.println("Movable Rectangle:");
        MovableRectangle movableRectangle = new MovableRectangle(rectangle.getUpperLeftPoint(), rectangle.getLowerRightPoint());
        movableRectangle.move(3, 2);
        System.out.println(movableRectangle);
        movableRectangle.CheckSpeed();
        System.out.println();

    }
}