package Threading;

public class Consume extends Thread{
    Company company;

    public Consume(Company company){
        this.company = company;
    }
    public void run(){
        while (true){
            try {
                company.consume_Item();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(2000);
            }catch (Exception e){

            }
        }
    }
}
