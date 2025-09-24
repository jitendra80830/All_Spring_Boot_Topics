package threads.consumerProducerProb;

public class PrintAlternativeTwoThread {
    public static void main(String[] args) {
        PrintBeeWebShared printer = new PrintBeeWebShared();
        Thread t1 = new Thread(printer::printBee);
        Thread t2 = new Thread(printer::printWeb);
        t1.start();
        t2.start();
    }
}
