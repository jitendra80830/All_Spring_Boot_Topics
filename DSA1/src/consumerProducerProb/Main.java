package consumerProducerProb;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Producer producer = new Producer(sharedResource);
        Consumer consumer = new Consumer(sharedResource);
        producer.start();
        consumer.start();
    }
}
