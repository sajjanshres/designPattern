package adapter.square;

public class Square implements SquareInterface {
    private final double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public void calculateSquareArea() {
        System.out.println("Square area: " + length * length);
    }
}
