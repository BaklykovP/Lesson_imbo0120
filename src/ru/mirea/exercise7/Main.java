package ru.mirea.exercise7;

public class Main {
    public static void main(String[] args){
        // Test Dish
        Plate plate = new Plate(1,10);
        Dish pan = new Pan(15,20);
        Cup cup = new Cup("blue", 3, 10);
        plate.makedFish();
        ((Pan) pan).makeSoup();
        cup.makedCoffee();
        System.out.println("\n" + plate + "\n" + pan + "\n" + cup + "\n------------------");

        // Test Dog
        Dog labrador = new Labrador(5, 36, "white");
        ((Labrador) labrador).actionLabrador();
        System.out.println();
        Corgi corgi = new Corgi(12, 14, "light brown");
        corgi.actionCorgi();
        System.out.println("\n" + labrador + "\n" + corgi + "\n");

    }
}