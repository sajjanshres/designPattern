package factoryPattern.triangle;

import factoryPattern.shape.Shape;
import factoryPattern.shape.ShapeFactory;

public class TriangleFactory extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Triangle();
    }
}
