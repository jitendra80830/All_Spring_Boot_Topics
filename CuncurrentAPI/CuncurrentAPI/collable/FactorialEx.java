package CuncurrentAPI.collable;

import java.util.concurrent.Callable;

public class FactorialEx implements Callable<Integer> {

    int fact;

    public FactorialEx(int fact) {
        this.fact = fact;
    }

    @Override
    public Integer call() throws Exception {
        int factAns = 1;
        for (int i = 2; i <=fact; i++) {
            factAns *= i;
        }
        return factAns;
    }
}
