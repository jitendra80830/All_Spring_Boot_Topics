package CuncurrentAPI.collable;

import java.util.concurrent.Callable;

public class SquareRoot implements Callable<Double> {
    int num;

    public SquareRoot(int num) {
        this.num = num;
    }

    @Override
    public Double call() throws Exception {

        return Math.sqrt(num);
    }
}
