package ru.mirea.exercise7;

public class Pan extends Dish {
    private int radius;
    private int deep;
    private double volume;

    public Pan(int radius, int deep) {
        this.radius = radius;
        this.deep = deep;
        calcVolume();
    }

    @Override
    public void calcVolume() {
        volume = Math.PI * radius * radius * deep;
    }

    public void makeSoup() {
        System.out.println("Soup is cooked");
    }

    @Override
    public String toString() {
        return "Pan{" +
                "volume=" + volume +
                '}';
    }
}