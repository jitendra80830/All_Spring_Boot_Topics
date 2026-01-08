package threads.Test;

public class PrintNumber implements Runnable {
    private static int num = 1;
    private static final int LIMIT = 100;

    @Override
    public void run() {

        while (true) {
            synchronized (PrintNumber.class) {
                if (num > LIMIT) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + " : " + num);
                num++;
            }
        }

    }
}
