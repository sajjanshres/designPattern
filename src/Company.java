import java.util.ArrayList;
import java.util.List;

public abstract class Company {

    private final String companyName;
    private double stockPrice;
    public List<Observer> members = new ArrayList<>();

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public abstract void registerMember(Observer observer);

    public abstract void unregisterMember(Observer observer);

    public abstract void notifyMembers();

    public double getStockPrice() {
        return this.stockPrice;
    }

    public void setStockPrice(double currentStockPrice) {
        this.stockPrice = currentStockPrice;
        notifyMembers();
    }

    public String getCompanyName() {
        return this.companyName;
    }

}
