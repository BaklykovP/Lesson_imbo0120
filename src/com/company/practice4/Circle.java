package com.company.practice4;

public class Circle extends Shape {
    private final double PI = 3.14;
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2* Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "PI=" + PI +
                ", radius=" + radius +
                '}';
    }
}
