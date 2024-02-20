package factory.rectangle;

import factory.shape.Shape;

public class Rectangle implements Shape {

    @Override
    public void aboutShape() {
        System.out.println("Rectangle shape");
    }
}
