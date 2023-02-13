package cardealership;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CarService implements CarServiceInterface {
    Scanner sc = new Scanner(System.in);
    CarMethods carMeths = new CarMethods();

    public void carDisplay() {
        List<Car> listCar = carMeths.carDisplay();
        int numOfCars = carMeths.carCount();
        System.out.println("Number of cars: " + numOfCars);
        String str = String.format("%-10s %-10s %-15s %-10s $%-5s", "Car ID", "Year", "Maker", "Model", "Price");
        System.out.println(str + "\n");
        double total = 0;
        for (Car car : listCar) {
            System.out.println(car);
            total = total + car.getPrice();
        }
        System.out.println("\nThe total cost of the cars :                     $" + total + "\n");
    }

    public void carAdd(Car car) {
        boolean status = carMeths.carAdd(car);
        if (status == true) {
            System.out.println("Added successfully");
        } else {
            System.out.println("Could not add it");
        }
    }

    public int carCount() {
        return carMeths.carCount();
    }

    public void carDelete(Car car) {
        boolean status = carMeths.carDelete(car);
        if (status == true)
            System.out.println("Deleted successfully");
        else
            System.out.println("Could not delete");
    }

    public void carUpdate(Car car) {
        System.out.println("Enter the field you want to update");
        String fieldChoice = sc.nextLine();
        switch (fieldChoice) {
            case "Make":
                System.out.println("Enter the new make");
                car.setMake(sc.nextLine());
                boolean makeStatus = carMeths.carUpdateMake(car.getCarId(), car.getMake());
                if (makeStatus == true)
                    System.out.println("Updated successfully");
                else
                    System.out.println("Could not update");
                break;
            case "Model":
                System.out.println("Enter the new model name");
                car.setModel(sc.nextLine());
                boolean modelStatus = carMeths.carUpdateModel(car.getCarId(), car.getModel());
                if (modelStatus == true)
                    System.out.println("Updated successfully");
                else
                    System.out.println("Could not update");
                break;
            case "Year":
                try {
                    System.out.println("Enter the new year");
                    car.setYear(Integer.parseInt(sc.nextLine()));
                    boolean yearStatus = carMeths.carUpdateYear(car.getCarId(), car.getYear());
                    if (yearStatus == true)
                        System.out.println("Updated successfully");
                    else
                        System.out.println("Could not update");
                } catch (InputMismatchException ime) {
                    System.out.println("Enter integer input");
                } catch (NumberFormatException nfe) {
                    System.out.println("Enter proper input");
                }
                break;
            case "Price":
                try {
                    System.out.println("Enter the new price");
                    car.setPrice(Double.parseDouble(sc.nextLine()));
                    boolean priceStatus = carMeths.carUpdatePrice(car.getCarId(), car.getPrice());
                    if (priceStatus == true)
                        System.out.println("Updated successfully");
                    else
                        System.out.println("Could not update");
                } catch (InputMismatchException ime) {
                    System.out.println("Enter double input");
                } catch (NumberFormatException nfe) {
                    System.out.println("Enter proper input");
                }
                break;
            default:
                System.out.println("Enter a valid field");

        }


    }
}