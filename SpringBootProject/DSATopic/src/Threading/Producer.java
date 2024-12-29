package Threading;

public class Producer extends Thread{
    Company company;

    public Producer(Company company){
        this.company = company;
    }

    public void run(){
        int i =1;
        while (true){
            try {
                company.produce_Item(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
            i++;
        }
    }

}
