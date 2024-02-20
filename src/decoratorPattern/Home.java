package decoratorPattern;

public abstract class Home {

    public double basePrice;

    public Home() {
        this.basePrice = 2500;
    }

    abstract Double getBasePrice();

}
