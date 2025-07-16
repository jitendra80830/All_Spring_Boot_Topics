package CuncurrentAPI.exchnager;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class MakeString {
    private Exchanger ex;
    private String str;

    public MakeString(Exchanger<String> ex) {
        this.ex = ex;
        str = new String();
        new Thread(r2).start();
    }

    Runnable r2 = () -> {
        char ch = 'A';
        try {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    str += ch++;
                }
                if (i == 0) {
                    str = ex.exchange(str, 20, TimeUnit.MILLISECONDS).toString();
                    continue;
                }
                str = ex.exchange(str).toString();
            }
        } catch (InterruptedException e) {
            System.out.println(e);

        } catch (TimeoutException et) {
            System.out.println("Time out occurred");

        }
    };
}
