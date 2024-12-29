package Threading;

public class MainThread {
    public static void main(String[] args) {
        /*MyThread t1 = new MyThread();
        Thread thread = new Thread(t1);
        MyThread2 myThread2 = new MyThread2();
        thread.setName("ThreadTest1");
        myThread2.setName("ThreadTest2");
        System.out.println("FirstName "+thread.getName());
        System.out.println("SecondName "+myThread2.getName());
        thread.start();
        myThread2.start();*/

        Company company = new Company();
        Producer producer = new Producer(company);
        Consume consume = new Consume(company);
        producer.start();
        consume.start();
    }
}
