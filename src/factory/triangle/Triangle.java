package factory.triangle;

import factory.shape.Shape;

public class Triangle  implements Shape {
    @Override
    public void aboutShape() {
        System.out.println("Triangle shape");
    }
}
