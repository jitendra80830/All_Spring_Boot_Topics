package CuncurrentAPI.exchnager;

import java.util.concurrent.Exchanger;

public class ExchangeDemo {
    public static void main(String[] args) {
        Exchanger<String> ex = new Exchanger<>();
        new UseString(ex);
        new MakeString(ex);
    }
}
