package ro.teamnet.zerotohero.oop.graphicshape;

public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double aria() {
        return side * side;
    }

    @Override
    public String toString() {
        return "sides = " + side;
    }
}
