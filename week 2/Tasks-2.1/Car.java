public class Car {
    private String logo;
    private String model;
    private int year;
    private double gasolineTankCapacity;
    private int topSpeed;

    public Car(String logo, String model, int year, double gasolineTankCapacity, int topSpeed) {
        this.logo = logo;
        this.model = model;
        this.year = year;
        this.gasolineTankCapacity = gasolineTankCapacity;
        this.topSpeed = topSpeed;
    }
    public String getLogo() {
        return logo;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public double getGasolineTankCapacity() {
        return gasolineTankCapacity;
    }
    public int getTopSpeed() {
        return topSpeed;
    }

    public static void main(String[] args) {
        Car myCar = new Car("Ferrari", "Spider", 2022, 100.0, 120);

        System.out.println("Car Logo: " + myCar.getLogo());
        System.out.println("Car Model: " + myCar.getModel());
        System.out.println("Car Year: " + myCar.getYear());
        System.out.println("Gasoline Tank Capacity: " + myCar.getGasolineTankCapacity() + " gallons");
        System.out.println("Top Speed: " + myCar.getTopSpeed() + " mph");
    }
}
