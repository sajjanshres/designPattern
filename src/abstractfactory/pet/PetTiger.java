package abstractfactory.pet;

import abstractfactory.Animal;

public class PetTiger implements Animal {
    @Override
    public void about() {
        System.out.println("Pet Tiger");
    }
}
