package factory.triangle;

import factory.shape.Shape;
import factory.shape.ShapeFactory;

public class TriangleFactory extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Triangle();
    }
}
