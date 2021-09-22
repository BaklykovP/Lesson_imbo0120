package ru.mirea.exercise3.practice3_1;

public class Circle {
    private final double PI = 3.14;
    private double radius;
    private double square;
    private double length;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getSquare() {
        square = PI * radius * radius;
        return square;
    }

    public double getLength() {
        length = 2 * PI * radius;
        return length;
    }
}
