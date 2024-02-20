package factory;

import factory.rectangle.RectangleFactory;
import factory.shape.Shape;
import factory.shape.ShapeFactory;
import factory.triangle.TriangleFactory;

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
