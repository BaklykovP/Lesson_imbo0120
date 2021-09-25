package ru.mirea.exercise7;

public class Corgi extends Dog{

    public Corgi(int age, double weight, String color) {
        super(age, weight, color);
        if(weight >= 14)
            System.out.println("Your dog's overweight.");
        else
            System.out.println("Your dog's weight is normal");
    }

    public void actionCorgi(){
        System.out.println("Corgi eats and drinks");
    }

}
