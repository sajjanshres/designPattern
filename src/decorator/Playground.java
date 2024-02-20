package decorator;

public class Playground extends Home {
    private final Home home;
    private final double playgroundPrice;

    public Playground(Home home) {
        this.home = home;
        this.playgroundPrice = 1000;
    }

    @Override
    public Double getBasePrice() {
        double cost = home.getBasePrice() + playgroundPrice;
        System.out.println("Playgorund cost: " + playgroundPrice);
        System.out.println("Total after adding playground: " + cost);
        return cost;
    }
}
