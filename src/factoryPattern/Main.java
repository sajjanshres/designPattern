package factoryPattern;

import factoryPattern.rectangle.RectangleFactory;
import factoryPattern.shape.Shape;
import factoryPattern.shape.ShapeFactory;
import factoryPattern.triangle.TriangleFactory;

public class Main {

    public static void main(String[] args) {

        ShapeFactory shapeRectangle = new RectangleFactory();
        Shape rectangle = shapeRectangle.createShape();
        rectangle.aboutShape();

        ShapeFactory shapeTriangle = new TriangleFactory();
        Shape triangle = shapeTriangle.createShape();
        triangle.aboutShape();

    }
}
