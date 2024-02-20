package abstractfactory.wild;

import abstractfactory.Animal;

public class WildTiger implements Animal {
    @Override
    public void about() {
        System.out.println("Wild Tiger");
    }
}
