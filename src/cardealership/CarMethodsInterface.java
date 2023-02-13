package cardealership;

import java.util.List;

public interface CarMethodsInterface {
    boolean carUpdateMake(String CarId,String make);
    boolean carDelete(Car car);
    boolean carUpdateModel(String carId,String model);
    boolean carUpdateYear(String carId,int year);
    boolean carUpdatePrice(String carId,double price);
    boolean carAdd(Car car);
    List<Car> carDisplay();
    int carCount();


}
