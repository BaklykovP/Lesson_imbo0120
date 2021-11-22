package ru.mirea.exercise15_16.section2;

import java.util.Random;

public class ATM implements Runnable {
    private Account account;
    Random random = new Random();

    public ATM(Account account) {
        this.account = account;

    }

    @Override
    public void run() {
        try {
            // случайный выбор действия
            while (account.getBalance() > 5000) {
                boolean t = random.nextBoolean();
                if (t) {
                    account.depositeATM();
                    Thread.sleep(10);
                }
                else {
                    account.withdrawATM();
                    Thread.sleep(15);
                }
            }
            System.out.println("Поток " + Thread.currentThread().getName() + " завершился");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}
