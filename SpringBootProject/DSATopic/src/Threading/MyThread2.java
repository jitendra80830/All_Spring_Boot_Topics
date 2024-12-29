package Threading;

public class MyThread2 extends Thread{

    public void run(){
        for (int i = 0; i <20 ; i++) {
            if(i%2!=0){
                System.out.print("Thread2 "+i+" ");
                System.out.println();
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
