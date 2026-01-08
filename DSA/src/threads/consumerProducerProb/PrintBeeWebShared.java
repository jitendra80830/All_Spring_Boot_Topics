package threads.consumerProducerProb;

public class PrintBeeWebShared {

    private boolean beeTurn = true;

    public synchronized void printBee(){
        while (true){
            while (!beeTurn){
                try {
                    wait();

                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }
            System.out.print("Bee");
            beeTurn = false;
            notify();
        }
    }

    public synchronized void printWeb(){
        while (true){
            while (beeTurn){
                try {
                    wait();
                }catch (InterruptedException ex){}
            }
            System.out.print("Web");
            beeTurn = true;
            notify();
        }
    }
}
