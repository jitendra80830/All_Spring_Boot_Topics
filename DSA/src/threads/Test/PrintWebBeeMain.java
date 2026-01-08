package threads.Test;

public class PrintWebBeeMain {
    public static void main(String[] args) {
        PrintWebBee printWebBee = new PrintWebBee();
        Thread t1 = new Thread(printWebBee::printWeb);
        Thread t2 = new Thread(printWebBee::printBee);
        t1.start();
        t2.start();
    }
}
