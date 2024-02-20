package builder.vehicle;

public class Car extends Vehicle {

    private String engineType;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String toString() {
        return "Brand: " + getBrandName() + " No of wheel: "
                + getNoOfWheels() + " Year: " + getYear() + " Engine: " + getEngineType();
    }


}
