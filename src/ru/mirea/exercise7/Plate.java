package ru.mirea.exercise7;

public class Plate extends Dish {
    private int radius;
    private int deep;
    private double volume;


    public Plate(int radius, int deep) {
        this.radius = radius;
        this.deep = deep;
        calcVolume();
    }

    @Override
    public void calcVolume() {
        volume = Math.PI * radius * radius * deep;
    }

    public void makedFish(){
        System.out.println("Cooked fish in a plate");
    }

    @Override
    public String toString() {
        return "Plate{" +
                "volume=" + volume +
                '}';
    }
}