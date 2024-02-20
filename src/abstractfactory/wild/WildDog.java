package abstractfactory.wild;

import abstractfactory.Animal;

public class WildDog implements Animal {
    @Override
    public void about() {
        System.out.println("Wild Dog");
    }
}
