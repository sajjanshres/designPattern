package abstractFactoryPattern.pet;

import abstractFactoryPattern.Animal;
import abstractFactoryPattern.AnimalFactory;

public class PetAnimalFactory implements AnimalFactory {
    public PetAnimalFactory() {
        System.out.println("Pet animal factory instantiated");
    }

    @Override
    public Animal createTiger() {
        return new PetTiger();
    }

    @Override
    public Animal createDog() {
        return new PetDog();
    }
}
