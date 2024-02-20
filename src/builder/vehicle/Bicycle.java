package builder.vehicle;

public class Bicycle extends Vehicle {

    public String toString() {
        return "Brand: " + getBrandName() + " No of wheel: " + getNoOfWheels() + " Year: " + getYear();
    }

}
