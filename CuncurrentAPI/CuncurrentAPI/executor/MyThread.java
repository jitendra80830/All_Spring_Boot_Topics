package CuncurrentAPI.executor;

public class MyThread implements Runnable {
    private int id;

    public MyThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Task " + id + " is running on thread " + Thread.currentThread().threadId());
    }
}
