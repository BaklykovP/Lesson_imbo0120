package ru.mirea.exercise15_16.section1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args){

        Robot robot = new Robot("Ваня", 16);

        StepByStepThread stepByStepThread1 = new StepByStepThread(robot);
        StepByStepThread stepByStepThread2 = new StepByStepThread(robot);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        service.execute(stepByStepThread1);
        service.execute(stepByStepThread2);
        service.shutdown();

    }
}
