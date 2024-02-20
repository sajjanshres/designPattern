package abstractfactory.wild;

import abstractfactory.Animal;
import abstractfactory.AnimalFactory;

public class WildAnimalFactory implements AnimalFactory {
    public WildAnimalFactory() {
        System.out.println("Wild animal factory instantiated");
    }

    @Override
    public Animal createTiger() {
        return new WildTiger();
    }

    @Override
    public Animal createDog() {
        return new WildDog();
    }
}
