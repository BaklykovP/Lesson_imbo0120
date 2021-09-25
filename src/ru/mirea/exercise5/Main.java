package ru.mirea.exercise5;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(new Point(1, 1), 10);
        System.out.println(circle);
        // Circle movement
        System.out.println("Movable Circle:");
        MovableCircle movableCircle = new MovableCircle(circle.getCenter(), circle.getRadius());
        System.out.println(movableCircle.getCenter());
        movableCircle.move(15, 12);
        System.out.println(movableCircle.getCenter());

        // point movement
        System.out.println("Movable Point:");
        MovablePoint movablePoint = new MovablePoint(10, 10);
        System.out.println(movablePoint);
        movablePoint.move(12, 19);
        System.out.println(movablePoint);
    }
}