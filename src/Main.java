import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle>rentedVehicles=new ArrayList<>();
        int choice;
        do {
            System.out.println("Vehicle Rental System");
            System.out.println("1. Rent a Car");
            System.out.println("2. Rent a Bike");
            System.out.println("3. Rent a Truck");
            System.out.println("4. View Rented Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Car Model: ");
                    String model = scanner.next();
                    scanner.next();
                    System.out.println("Enter Rental Days: ");

                    int days = scanner.nextInt();

                    Car car = new Car();
                    car.setModel(model);
                    car.setDay_count(days);
                    rentedVehicles.add(car);

                    car.displayDetails();
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter Bike Brand: ");
                    String brand = scanner.next();
                    scanner.next();
                    System.out.println("Enter Rental Hours: ");
                    int hours = scanner.nextInt();
                    Bike bike = new Bike();
                    bike.setBrand(brand);
                    bike.setHourly_count(hours);
                    rentedVehicles.add(bike);

                    bike.displayDetails();
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Enter Truck Type: ");
                    String type = scanner.next();
                    scanner.next();
                    System.out.println("Enter Rental Weeks: ");
                    int weeks = scanner.nextInt();
                    Truck truck = new Truck();
                    truck.setType(type);
                    truck.setWeek_count(weeks);
                    rentedVehicles.add(truck);

                    truck.displayDetails();
                    System.out.println();
                    break;

                case 4:
                    System.out.println("\nRented Vehicles:");
                    if (rentedVehicles.isEmpty()) {
                        System.out.println("No vehicles rented yet.");
                    } else {
                        for (Vehicle vehicle : rentedVehicles) {
                            vehicle.displayDetails();
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the Vehicle Rental System!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

}