package threads.Test;

public class Consumer extends Thread {

    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        try {
            while (true) {
                sharedResource.consume();
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
        }
    }
}
