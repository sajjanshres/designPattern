package adapter.rectangle;

public class Rectangle implements RectangleInterface {
    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateRectangleArea() {
        System.out.println("Rectangle area: " + length * breadth);
    }
}
