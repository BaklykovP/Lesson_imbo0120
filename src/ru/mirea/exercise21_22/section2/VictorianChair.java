package ru.mirea.exercise21_22.section2;

public class VictorianChair implements Chair {
    @Override
    public void printName() {
        System.out.println("VictorianChair");
    }

    @Override
    public void printFunctions() {
        System.out.println("Никаких функций нет.");
    }
}
