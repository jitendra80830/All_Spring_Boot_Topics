package CuncurrentAPI.executor;

public class UsingRunnable {
    public static void main(String[] args) {
        Task th = new Task(2);
        Thread thread = new Thread(th);
        for (int i = 0; i < 5; i++) {
            thread.start();
        }

    }
}
class Task implements Runnable{


    int id;
    public Task(int id){
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Task "+id+" for Thread "+Thread.currentThread().threadId());
    }
}
