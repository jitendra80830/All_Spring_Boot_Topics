package threads.Test;

public class PrintWebBee {
    private boolean iswebTurn = false;

    public synchronized void printWeb() {

        while (true) {
            while (iswebTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.print("Webb");
            iswebTurn = true;
            notify();
        }

    }

    public synchronized void printBee() {
        while (true) {
            while (!iswebTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.print("Bee");
            iswebTurn = false;
            notify();
        }
    }
}
