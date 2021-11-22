package ru.mirea.exercise15_16.section1;

public class Robot {
    private String name;
    private int lifeTime;

    public Robot(String name, int lifeTime) {
        this.name = name;
        this.lifeTime = lifeTime;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public synchronized void rightStep(){
        System.out.println("Правый шаг");
        --lifeTime;
    }

    public synchronized void leftStep(){
        System.out.println("Левый шаг");
        --lifeTime;
    }
}
