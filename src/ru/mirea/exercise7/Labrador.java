package ru.mirea.exercise7;

public class Labrador extends Dog {

    public Labrador(int age, double weight, String color) {
        super(age, weight, color);
        if(weight > 40)
            System.out.println("Your dog's overweight.");
        else
            System.out.println("Your dog's weight is normal");
    }

    public void actionLabrador(){
        System.out.println("Labrador runs and jumps.");
    }
}
