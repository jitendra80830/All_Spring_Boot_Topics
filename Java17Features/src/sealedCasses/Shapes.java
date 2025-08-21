package sealedCasses;

public abstract sealed class Shapes permits Circle, Square {

    public abstract double area();
}
