package abstractFactoryPattern.wild;

import abstractFactoryPattern.Animal;

public class WildDog implements Animal {
    @Override
    public void about() {
        System.out.println("Wild Dog");
    }
}
