package ru.mirea.practice3.practice3_2;

public class Human {
    String name;
    int age;
    Head head = new Head();
    Hand hand = new Hand();
    Leg leg = new Leg();

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfoAboutLimbs() {
        this.head.getInfoHead();
        this.hand.getInfoHand();
        this.leg.getInfoHead();
        System.out.println("Every is functioning =)");
    }

}
