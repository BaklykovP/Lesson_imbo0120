package ru.mirea.exercise21_22.section2;

public class MagicChair implements Chair{
    @Override
    public void printName() {
        System.out.println("MagicChair");
    }

    @Override
    public void printFunctions() {
        System.out.println("Кресло умеет летать на большие расстояния.");
    }
}
