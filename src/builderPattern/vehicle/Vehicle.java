package builderPattern.vehicle;

public abstract class Vehicle {

    private String brandName;
    private String noOfWheels;
    private String year;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(String noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
