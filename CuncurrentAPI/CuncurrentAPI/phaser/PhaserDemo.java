package CuncurrentAPI.phaser;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int currentPhase;
        System.out.println("Starting.....");
        new MyThread(phaser , "A");
        new MyThread(phaser , "B");
        new MyThread(phaser , "B");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "+currentPhase+" completed");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "+currentPhase+" completed");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "+currentPhase+" completed");

        phaser.arriveAndDeregister();

        if(phaser.isTerminated()){
            System.out.println("Phaser is terminated");
        }

    }
}
