public class Truck implements Vehicle{
   private int week_count;
    private String type;
    final double rent_rate=500;

    public Truck(int week_count, String type) {
        this.week_count = week_count;
        this.type = type;
    }
    public Truck() {

    }

    public int getWeek_count() {
        return week_count;
    }

    public void setWeek_count(int week_count) {
        this.week_count = week_count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRent_rate() {
        return rent_rate;
    }

    @Override
    public double calculateRentalCost() {

        return week_count*rent_rate;
    }

    @Override
    public void displayDetails() {
        System.out.println("\nRental Details: \nCar Model: " + type + " \nDaily Rental \nRate: $" + rent_rate + " \nRental Cost: $" + calculateRentalCost());
    }
}
