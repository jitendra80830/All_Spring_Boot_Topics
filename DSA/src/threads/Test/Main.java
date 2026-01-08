package threads.Test;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource=new SharedResource();

        Producer t1 = new Producer(sharedResource);
        Consumer t2 = new Consumer(sharedResource);
        t1.start();
        t2.start();


    }
}
