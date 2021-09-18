package com.company.practice2;

import java.util.Scanner;

public class TestDog {
    public TestDog() {
        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        Dog arrayDog[] = new Dog[2];
        for(int i = 0; i < arrayDog.length; ++i){
            System.out.print("Введите кличку собаки: ");
            name = sc.next();
            System.out.print("Введите возраст собаки: ");
            age = sc.nextInt();
            arrayDog[i] = new Dog(name, age);
        }

        for(int i = 0; i < arrayDog.length; ++i){
            System.out.println(arrayDog[i].toString());
        }

    }
}
