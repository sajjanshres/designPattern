package factory.rectangle;

import factory.shape.Shape;
import factory.shape.ShapeFactory;

public class RectangleFactory extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
