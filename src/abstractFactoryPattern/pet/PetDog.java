package abstractFactoryPattern.pet;

import abstractFactoryPattern.Animal;

public class PetDog implements Animal {
    @Override
    public void about() {
        System.out.println("Pet Dog");
    }
}
