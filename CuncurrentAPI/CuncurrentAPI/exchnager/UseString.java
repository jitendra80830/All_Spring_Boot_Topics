package CuncurrentAPI.exchnager;

import java.util.concurrent.Exchanger;

public class UseString {
    Exchanger<String> ex;
    String str;

    public UseString(Exchanger<String> ex) {
        this.ex = ex;
        new Thread(r1).start();
    }
    Runnable r1 = () ->{
        try {
            for (int i = 0; i < 3; i++) {
                if (i == 2) {
                    Thread.sleep(500);
                    continue;
                }
                // Exchange an empty buffer for a full one
                str = ex.exchange(new String());
                System.out.println("GOT :"+str);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    };

}
