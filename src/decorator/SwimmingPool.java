package decorator;

public class SwimmingPool extends Home {

    private final Home home;
    private final double swimmingPoolCost;

    public SwimmingPool(Home home) {
        this.home = home;
        this.swimmingPoolCost = 2000;
    }

    @Override
    Double getBasePrice() {
        double cost = home.getBasePrice() + swimmingPoolCost;
        System.out.println("Swimming pool cost: " + swimmingPoolCost);
        System.out.println("Total after adding swimming pool: " + cost);
        return cost;
    }
}
