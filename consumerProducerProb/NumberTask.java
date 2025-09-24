package threads.consumerProducerProb;

public class NumberTask implements Runnable {

    public static int number = 1;
    public static final int LIMIT = 100;


    @Override
    public void run() {
        while (true) {
            synchronized (NumberTask.class) {
                if (number > LIMIT) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + " : " + number);
                number++;
            }
        }

    }
}
