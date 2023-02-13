package cardealership;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(String.format("%60s","Welcome to the Grand Auto Dealers"));
        Scanner sc=new Scanner(System.in);
        String firstChoice;
        CarService carServe=new CarService();
        do {
            System.out.println("1. List\n2. Add\n3. Delete\n4. Update\n5. Quit\nEnter the option as a String(case-sensitive)");
            System.out.print("Enter command: ");firstChoice=sc.nextLine();
            switch(firstChoice) {
                case "List":
                    carServe.carDisplay();
                    break;
                case "Add":
                    try {
                        Car car=new Car();
                        int noOfCars=carServe.carCount();
                        if (noOfCars<20) {
                            System.out.print("Car ID: ");
                            car.setCarId(sc.nextLine());System.out.println();
                            System.out.print("Make: ");
                            car.setMake(sc.nextLine());System.out.println();
                            System.out.print("Model: ");
                            car.setModel(sc.nextLine());System.out.println();
                            System.out.print("Year: ");
                            car.setYear(sc.nextInt());System.out.println();
                            System.out.print("Price: ");
                            car.setPrice(sc.nextDouble());
                            carServe.carAdd(car);
                        }
                        else {
                            System.out.println("Reached maximum capacity. Delete some entries to add.");
                            break;
                        }
                        sc.nextLine();
                    }catch(InputMismatchException ime) {
                        System.out.println("Enter proper input");
                        sc.nextLine();
                    }
                    break;
                case "Delete":
                    System.out.println("Enter the ID of the car you want to delete");
                    Car car=new Car();
                    car.setCarId(sc.nextLine());
                    carServe.carDelete(car);
                    break;
                case "Update":
                    System.out.println("Enter the ID of the car you want to update");
                    String carId=sc.nextLine();
                    Car carb=new Car();
                    carb.setCarId(carId);
                    carServe.carUpdate(carb);
                    break;
                case "Quit":
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Sorry but \""+firstChoice+"\" is not a valid command. Please try again.");
                    break;
            }
        }while(!firstChoice.equalsIgnoreCase("quit"));
        sc.close();
    }

}


