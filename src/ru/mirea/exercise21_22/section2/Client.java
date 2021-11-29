package ru.mirea.exercise21_22.section2;

public class Client {
    public static void main(String[] args) {
        ChairsFactory chairsFactory = new NewChairsFactory();
        Chair magicChair = chairsFactory.createMagicChair();
        Chair victorianChair = chairsFactory.creatVictorianChair();
        Chair multifunctionalChair = chairsFactory.creatMultifunctionalChair();

        magicChair.printFunctions();

        victorianChair.printFunctions();

        multifunctionalChair.printFunctions();

        // использование интерфейса Chair в методе sit(Chair chair).
        sit(magicChair);
        sit(victorianChair);
        sit(multifunctionalChair);
    }

    public static void sit(Chair chair){
        System.out.print("Человек на стуле ");
        chair.printName();
    }
}
