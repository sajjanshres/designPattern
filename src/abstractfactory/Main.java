package abstractfactory;

public class Main {
    public static void main(String[] args) {

        AnimalFactory wildAnimalFactory = AnimalFactory.createAnimalFactory(AnimalFactory.AnimalType.WILD);
        Animal wildTiger = wildAnimalFactory.createTiger();
        wildTiger.about();
        Animal wilDog = wildAnimalFactory.createDog();
        wilDog.about();

        System.out.println("------------");

        AnimalFactory petAnimalFactory = AnimalFactory.createAnimalFactory(AnimalFactory.AnimalType.PET);
        Animal petTiger = petAnimalFactory.createTiger();
        petTiger.about();
        Animal petDog = petAnimalFactory.createDog();
        petDog.about();

    }
}
