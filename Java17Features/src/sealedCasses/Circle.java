package sealedCasses;

public final class Circle extends Shapes {
    public int getCircle(int r) {
        return (22 / 7) * r * r;
    }

    @Override
    public double area() {
        return 10*10;
    }
}
