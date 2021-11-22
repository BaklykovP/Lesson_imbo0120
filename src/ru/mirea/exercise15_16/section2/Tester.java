package ru.mirea.exercise15_16.section2;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tester {
    public static void main(String[] args) {
        // Создадим значение от 10К до 50к, чтобы после передать значение на счет пользователя.

        Random random = new Random();
        int value = 10000 + random.nextInt(50001 -10000);

        Person stas = new Person("Стас");
        Account account = new Account(value, stas);

        System.out.println("Уважаемый " + stas.getName() + " на вашему счечу доступно: " + value + ".");

        ATM atm1 = new ATM(account);
        ATM atm2 = new ATM(account);
        ATM atm3 = new ATM(account);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        service.execute(atm1);
        service.execute(atm2);
        service.execute(atm3);

        service.shutdown();

    }
}
