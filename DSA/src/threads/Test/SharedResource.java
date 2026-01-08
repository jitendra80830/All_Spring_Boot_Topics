package threads.Test;

public class SharedResource {
    private int data;
    private boolean isProduced = false;


    public synchronized void produce(int data) {

        while (isProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.data = data;
        System.out.println("produced: " + this.data);
        isProduced = true;
        notify();
    }

    public synchronized void consume() {

        while (!isProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("consume: " + this.data);
        isProduced = false;
        notify();
    }
}
