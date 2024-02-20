package abstractFactoryPattern.wild;

import abstractFactoryPattern.Animal;

public class WildTiger implements Animal {
    @Override
    public void about() {
        System.out.println("Wild Tiger");
    }
}
