package ru.mirea.exercise21_22.section2;

public class MultifunctionalChair implements Chair{
    @Override
    public void printName() {
        System.out.println("MultifunctionalChair");
    }

    @Override
    public void printFunctions() {
        System.out.println("Кресло умеет откидывать спинку.");
    }
}
