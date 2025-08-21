package CuncurrentAPI.phaser;

import java.util.concurrent.Phaser;

public class MyThread {
    Phaser phaser;
    String name;

    public MyThread(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        this.phaser.register();
        new Thread(r1).start();
    }

    Runnable r1 = () -> {
        System.out.println("Thread " + name + " is in phase one");
        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Thread " + name + " is in phase two");
        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread " + name + " is in phase Three");
        phaser.arriveAndDeregister();

    };
}
