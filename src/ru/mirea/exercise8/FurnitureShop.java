package ru.mirea.exercise8;

import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureShop {
    ArrayList<Furniture> Basket = new ArrayList<>();

    public FurnitureShop() {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Здравсвуйте, что вас интерисует ? \n 1--СТОЛЫ \n 2--КРЕСЛА ");
            int value = inputValue(0);
            if (value == 1) {
                System.out.println("Какой вид стола вам нужен: \n 1--ГЕЙМЕРСКИЙ \n 2--ОФИСНЫЙ \n 3--КУХОННЫЙ");
                value = inputValue(1);
                switch (value) {
                    case 1:
                        System.out.println("Цена стола равна 4600");
                        Basket.add(0, new Table("Gaming", "Wooden", 75, 160, 4600));
                        break;
                    case 2:
                        System.out.println("Цена стола равна 2400");
                        Basket.add(0, new Table("Office", "Wooden", 80, 140, 2400));
                        break;
                    case 3:
                        System.out.println("Цена стола равна 1500");
                        Basket.add(0, new Table("Kitchen", "Wooden", 70, 100, 1500));
                        break;
                }

            } else if (value == 2) { // Проверка кресла
                System.out.println("Какой вид кресла вам нужен: \n 1--ГЕЙМЕРСКИЙ \n 2--ОФИСНЫЙ");
                value = inputValue(0);
                switch (value) {
                    case 1:
                        System.out.println("Цена кресла равна 4900");
                        Basket.add(new Armchair("Gaming", "Plastic", 4900));
                        break;
                    case 2:
                        System.out.println("Цена стола равна 3500");
                        Basket.add(new Armchair("Office", "Plastic", 3500));
                        break;
                }
            }
            System.out.println("Вы хотите продолжить покупку ? \n 1--ДА \n 2--НЕТ");
            value= inputValue(0);
            if(value == 2)
                break;

        }
    }

    private int inputValue(int t) {
        Scanner sc = new Scanner(System.in);
        int value;
        while (true) {
            if (t == 0) {
                value = sc.nextInt();
                if (value != 1 && value != 2) {
                    System.out.println("Такого католога не существует, попробуйте еще раз: ");
                    continue;
                }
                break;
            } else if (t == 1) {
                value = sc.nextInt();
                if(value != 1 && value != 2 && value != 3) {
                    System.out.println("Такого католога не существует, попробуйте еще раз: ");
                    continue;
                }
                break;
            }
        }
        return value;
    }

    @Override
    public String toString() {
        return "FurnitureShop{" +
                "Basket=" + Basket +
                '}';
    }



}
