package factoryPattern.rectangle;

import factoryPattern.shape.Shape;
import factoryPattern.shape.ShapeFactory;

public class RectangleFactory extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
