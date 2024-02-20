package builder.builder;

import builder.vehicle.Vehicle;

public interface Builder {

    Builder setBrandName(String name);

    Builder noOfWheels(String noOfWheels);

    Builder setYear(String year);

    Builder engineType(String engineType);

    Vehicle getVehicle();
}
