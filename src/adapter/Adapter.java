package adapter;

import adapter.rectangle.RectangleInterface;
import adapter.square.SquareInterface;

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
