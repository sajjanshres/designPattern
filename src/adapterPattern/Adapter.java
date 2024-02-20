package adapterPattern;

import adapterPattern.rectangle.RectangleInterface;
import adapterPattern.square.SquareInterface;

public class Adapter implements RectangleInterface {

    private final SquareInterface square;

    public Adapter(SquareInterface square) {
        this.square = square;
    }

    @Override
    public void calculateRectangleArea() {
        square.calculateSquareArea();
    }
}
