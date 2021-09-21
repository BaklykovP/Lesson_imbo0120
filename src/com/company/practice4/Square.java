package com.company.practice4;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public void setSide(double side) {
        this.width = side;
    }

    public void setWidth(double side) {
        this.width = side;
    }

    public double getSide() {
        return this.width;
    }

    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + width +
                '}';
    }
}
