package builder.builder;

import builder.vehicle.Car;
import builder.vehicle.Vehicle;

public class CarBuilder implements Builder {

    private final Car car = new Car();

    @Override
    public Builder setBrandName(String name) {
        car.setBrandName(name);
        return this;
    }

    @Override
    public Builder noOfWheels(String noOfWheels) {
        car.setNoOfWheels(noOfWheels);
        return this;
    }

    @Override
    public Builder setYear(String year) {
        car.setYear(year);
        return this;
    }

    @Override
    public Builder engineType(String engineType) {
        car.setEngineType(engineType);
        return this;
    }

    @Override
    public Vehicle getVehicle() {
        return car;
    }
}
