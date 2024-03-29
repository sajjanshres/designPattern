package builder;

import builder.builder.BicycleBuilder;
import builder.builder.Builder;
import builder.builder.CarBuilder;
import builder.vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {

        Builder carBuilder = new CarBuilder();
        System.out.println("Car object constructed");
        System.out.println("-----------------------");
        Vehicle car = carBuilder.setBrandName("Toyota")
                .engineType("Petroleum")
                .noOfWheels("4")
                .setYear("2022")
                .getVehicle();
        System.out.println(car);

        Builder bicycleBuilder = new BicycleBuilder();
        System.out.println("");
        System.out.println("Bicycle object constructed");
        System.out.println("-----------------------");
        Vehicle bicycle = bicycleBuilder.setBrandName("BMX")
                .noOfWheels("2")
                .setYear("2024")
                .getVehicle();
        System.out.println(bicycle);
    }
}
