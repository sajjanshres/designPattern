package factoryPattern.triangle;

import factoryPattern.shape.Shape;

public class Triangle  implements Shape {
    @Override
    public void aboutShape() {
        System.out.println("Triangle shape");
    }
}
