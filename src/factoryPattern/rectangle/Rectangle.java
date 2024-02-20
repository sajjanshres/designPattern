package factoryPattern.rectangle;

import factoryPattern.shape.Shape;

public class Rectangle implements Shape {

    @Override
    public void aboutShape() {
        System.out.println("Rectangle shape");
    }
}
