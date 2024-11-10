public class Car implements Vehicle{
    final double rent_rate=50;
    private int day_count;
    private String model;

    public Car(int day_count, String model) {
        this.day_count = day_count;
        this.model = model;
    }
    public Car() {
    }

    public double getRent_rate() {
        return rent_rate;
    }

    public int getDay_count() {
        return day_count;
    }

    public void setDay_count(int day_count) {
        this.day_count = day_count;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double calculateRentalCost() {

        return day_count*rent_rate;
    }

    @Override
    public void displayDetails() {
        System.out.println("\nRental Details: \nCar Model: " + model + " \nDaily Rental \nRate: $" + rent_rate + " \nRental Cost: $" + calculateRentalCost());
    }
}
