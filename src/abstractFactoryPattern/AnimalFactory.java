package abstractFactoryPattern;

import abstractFactoryPattern.pet.PetAnimalFactory;
import abstractFactoryPattern.wild.WildAnimalFactory;

public interface AnimalFactory {

    Animal createTiger();

    Animal createDog();

    static AnimalFactory createAnimalFactory(AnimalType type) {
        return switch (type) {
            case WILD -> new WildAnimalFactory();
            case PET -> new PetAnimalFactory();
        };
    }

    enum AnimalType {
        WILD, PET
    }

}
