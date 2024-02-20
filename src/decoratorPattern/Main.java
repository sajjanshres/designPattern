package decoratorPattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("Adding one swimming pool and two playground to the detach home");
        System.out.println("---------------------------------------------------------------");
        Home home = new SwimmingPool(new Playground(new Playground(new DetachHome())));
        home.getBasePrice();
    }
}
