package decoratorPattern;

public class DetachHome extends Home {

    private final double additionalPrice;

    public DetachHome() {
        this.additionalPrice = 50000;
    }

    @Override
    Double getBasePrice() {
        double cost = basePrice + additionalPrice;
        System.out.println("Detach home cost: " + cost);
        return cost;
    }
}
