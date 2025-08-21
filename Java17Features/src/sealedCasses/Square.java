package sealedCasses;

public final class Square extends Shapes {
    public int getSquare(int a) {
        return a * a;
    }

    @Override
    public double area() {
        return 10 * 10;
    }
}
