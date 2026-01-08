package threads.consumerProducerProb;

public class SharedResource {
    private int data;
    private boolean isProduced = false;

    public synchronized void producer(int value) throws InterruptedException {

        while (isProduced){
            wait();
        }
        this.data = value;
        System.out.println("Produced : "+data);
        isProduced = true;
        notify();
    }
    public synchronized void consume() throws InterruptedException {
        while (!isProduced){
            wait();
        }
        System.out.println("Consume: "+this.data);
        isProduced = false;
        notify();
    }
}
