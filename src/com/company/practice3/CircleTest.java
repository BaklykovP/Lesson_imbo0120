package com.company.practice3;

import java.util.Scanner;

public class CircleTest {
    public CircleTest() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите радиус круга: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Длина круга: " + circle.getLength());
        System.out.println("Площадь круга: " + circle.getSquare());
    }
}
