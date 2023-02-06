package cardealership;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
