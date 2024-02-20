package abstractFactoryPattern.pet;

import abstractFactoryPattern.Animal;

public class PetTiger implements Animal {
    @Override
    public void about() {
        System.out.println("Pet Tiger");
    }
}
