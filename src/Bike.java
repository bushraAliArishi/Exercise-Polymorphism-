public class Bike implements Vehicle {
   private int hourly_count;
    private String brand;
    final double rent_rate=10;

    public Bike(int hourly_count, String brand) {
        this.hourly_count = hourly_count;
        this.brand = brand;
    }
    public Bike() {
    }

    public int getHourly_count() {
        return hourly_count;
    }

    public void setHourly_count(int hourly_count) {
        this.hourly_count = hourly_count;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getRent_rate() {
        return rent_rate;
    }

    @Override
    public double calculateRentalCost() {

        return hourly_count*rent_rate;
    }

    @Override
    public void displayDetails() {
        System.out.println("\nRental Details: \nCar Model: " + brand + " \nDaily Rental \nRate: $" + rent_rate + " \nRental Cost: $" + calculateRentalCost());
    }
}