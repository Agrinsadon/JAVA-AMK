public class Coffee {
    private boolean powerOn;
    private String coffeeType;
    private int coffeeAmount;

    public Coffee() {
        powerOn = false;
        coffeeType = "Normal";
        coffeeAmount = 10;
    }

    public void turnOn() {
        powerOn = true;
    }

    public void turnOff() {
        powerOn = false;
    }

    public void setCoffeeType(String type) {
        if (powerOn) {
            coffeeType = type;
        } else {
            System.out.println("Coffee maker is off. Turn it on to change coffee type.");
        }
    }

    public void setCoffeeAmount(int amount) {
        if (powerOn && amount >= 10 && amount <= 80) {
            coffeeAmount = amount;
        } else {
            System.out.println("Coffee maker is off or the amount is out of range (10-80 ml). Turn it on to change the amount.");
        }
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }
    public static void main(String[] args) {
        Coffee coffeeMaker = new Coffee();

        coffeeMaker.turnOn();

        coffeeMaker.setCoffeeType("Espresso");
        coffeeMaker.setCoffeeAmount(40);

        System.out.println("Welcome to Agrin's Coffee shop!");
        System.out.println("Coffee Type: " + coffeeMaker.getCoffeeType());
        System.out.println("Coffee Amount: " + coffeeMaker.getCoffeeAmount() + " ml");

        coffeeMaker.turnOff();
    }
}
