package Threading;

public class Company {

    int n;
    boolean f = false;
    //if f == false then chance to produce
    //if f == true then chance to consume
    synchronized public void produce_Item(int n) throws InterruptedException {
        if(f){
            wait();
        }
        this.n = n;
        f = true;
        notify();
        System.out.println("produced Item "+n);
    }

    synchronized public int consume_Item() throws InterruptedException {
        if(!f){
            wait();
        }
        System.out.println("Consumed data "+this.n);
        f = false;
        notify();
        return this.n;
    }
}
