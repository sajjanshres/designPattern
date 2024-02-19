package builderPattern.builder;

import builderPattern.vehicle.Bicycle;
import builderPattern.vehicle.Vehicle;

public class BicycleBuilder implements Builder {
    private final Bicycle bicycle = new Bicycle();

    @Override
    public Builder setBrandName(String name) {
        bicycle.setBrandName(name);
        return this;
    }

    @Override
    public Builder noOfWheels(String noOfWheels) {
        bicycle.setNoOfWheels(noOfWheels);
        return this;
    }

    @Override
    public Builder setYear(String year) {
        bicycle.setYear(year);
        return this;
    }

    @Override
    public Builder engineType(String engineType) {
        throw new IllegalArgumentException("Bicycle doesn't have an engine");
    }

    @Override
    public Vehicle getVehicle() {
        return bicycle;
    }
}
