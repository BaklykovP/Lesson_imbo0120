package ru.mirea.exercise1;
import java.util.Scanner;

public class practice1_7 {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число для вычисления факториала: ");
        int num = sc.nextInt();
        if(num < 0)
            System.out.println("Не правильное значение");
        else
            System.out.println(factorial(num));

    }

    public static int factorial(int value) {
        int fac = 1;
        if (value == 0)
            return 1;
        else {
            for (int i = value; i >= 1; --i) {
                fac *= i;
            }
            return fac;
        }
    }
}
