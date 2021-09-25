package ru.mirea.exercise7;

public class Cup extends  Dish{
    private String color;
    private int radius;
    private int deep;
    private double volume;


    public Cup(String color, int radius, int deep) {
        this.color = color;
        this.radius = radius;
        this.deep = deep;
        calcVolume();
    }

    public void calcVolume() {
        volume = Math.PI * radius * radius * deep;
    }

    public void makedCoffee(){
        System.out.println("Hot coffee in a cup.");
    }

    @Override
    public String toString() {
        return "Cup{" +
                "volume=" + volume +
                '}';
    }
}
