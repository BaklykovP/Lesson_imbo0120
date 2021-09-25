package ru.mirea.exercise7;

public abstract class Dog {
    protected int age;
    protected double weight;
    protected String color;

    public Dog(int age, double weight, String color) {
        this.age = age;
        this.weight = weight;
        this.color = color;

        if(age > 9)
            System.out.println("Your dog's old");
        else
            System.out.println("Your dog's young");
    }
    public void move(){
        System.out.println("MoveDog");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
