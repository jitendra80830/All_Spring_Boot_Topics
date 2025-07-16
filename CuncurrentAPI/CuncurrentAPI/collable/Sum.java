package CuncurrentAPI.collable;

import java.util.concurrent.Callable;

class Sum implements Callable<Integer> {

    int stop;

    public Sum(int stop) {
        this.stop = stop;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }
}
