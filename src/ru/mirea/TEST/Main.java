package ru.mirea.TEST;

/*
public class Main {

    public static void main(String[] args) {

        CommonResource commonResource= new CommonResource();
        for (int i = 1; i < 6; i++){

            Thread t = new Thread(new CountThread(commonResource));
            t.setName("Thread "+ i);
            t.start();
        }
    }
}

class CommonResource{

    int x;
    synchronized void increment(){
        x=1;
        for (int i = 1; i < 5; i++){
            System.out.printf("%s %d \n", Thread.currentThread().getName(), x);
            x++;
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){}
        }
    }
}

class CountThread implements Runnable{

    CommonResource res;
    CountThread(CommonResource res){
        this.res=res;
    }

    public void run(){
        res.increment();
    }
}*/

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        System.out.println("Available number of cores: " + Runtime.getRuntime().availableProcessors());

        Tunnel tunnel = new Tunnel();

        ShipGenerator shipGenerator = new ShipGenerator(tunnel, 10);

        PierLoader pierLoader1 = new PierLoader(tunnel, Type.DRESS);
        PierLoader pierLoader2 = new PierLoader(tunnel, Type.BANANA);
        PierLoader pierLoader3 = new PierLoader(tunnel, Type.MEAL);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        service.execute(shipGenerator);
        service.execute(pierLoader1);
        service.execute(pierLoader2);
        service.execute(pierLoader3);

        service.shutdown();
    }

}