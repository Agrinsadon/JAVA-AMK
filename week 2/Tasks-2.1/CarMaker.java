public class CarMaker {
    private int year;
    private double mileage;
    private double tankCapacity;
    private double topSpeed;
    public CarMaker(int year, double mileage, double tankCapacity, double topSpeed) {
        this.year = year;
        this.mileage = mileage;
        this.tankCapacity = tankCapacity;
        this.topSpeed = topSpeed;
    }
    @Override
    public String toString() {
        return "Car [Year= " + year + ", Mileage= " + mileage + " mpg, Tank Capacity= " + tankCapacity + " gallons, Top Speed= " + topSpeed + " km/h]";
    }
}
class Main {
    public static void main(String[] args) {
        CarMaker car1 = new CarMaker(2022, 200.50, 15.0, 120.0);
        System.out.println(car1.toString());
    }
}