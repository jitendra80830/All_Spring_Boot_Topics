package Threading;

public class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            {
                if (i % 2 == 0) {
                    System.out.print("Thread1 " + i + " ");
                    System.out.println();
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }
}
