package cardealership;

public class Car {
    private String carid;
    private String make;
    private String model;
    private int year;
    private double price;

    @Override
    public String toString() {
        String str=String.format("%-10s %-10s %-15s %-10s $%-5s", carid,year,make,model,price);
        return str;
    }
}
