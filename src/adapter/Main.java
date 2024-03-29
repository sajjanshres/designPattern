package adapter;

import adapter.rectangle.Rectangle;
import adapter.square.Square;

public class Main {

    public static void main(String[] args) {

        Square square = new Square(20);
        Rectangle rectangle = new Rectangle(20, 50);
        Adapter adapter = new Adapter(square);
        adapter.calculateRectangleArea();
        rectangle.calculateRectangleArea();
    }
}
