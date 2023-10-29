// Cruise control
public class Car {
    private double topSpeed;
    private boolean cruiseControlOn;
    private double targetSpeed;
    private double currentSpeed;

    public Car(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setTargetSpeed(double targetSpeed) {
        if (!cruiseControlOn) {
            this.targetSpeed = Math.max(0.0, Math.min(topSpeed, targetSpeed));
        }
    }

    public boolean turnOnCruiseControl() {
        if (!cruiseControlOn && targetSpeed > 0) {
            cruiseControlOn = true;
            return true;
        }
        return false;
    }

    public void turnOffCruiseControl() {
        cruiseControlOn = false;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void accelerate(double acceleration) {
        if (cruiseControlOn) {
            currentSpeed = Math.min(topSpeed, currentSpeed + acceleration);
            checkSpeedReachedTarget();
        }
    }

    public void decelerate(double deceleration) {
        if (cruiseControlOn) {
            currentSpeed = Math.max(0.0, currentSpeed - deceleration);
            checkSpeedReachedTarget();
        }
    }

    private void checkSpeedReachedTarget() {
        if (currentSpeed == targetSpeed) {
            System.out.println("Congratulations! You have reached the target speed.");
        } else if (currentSpeed < targetSpeed) {
            System.out.println("Target speed not reached. Cruise control turned off.");
            turnOffCruiseControl();
        }
    }
    public static void main(String[] args) {
        Car car = new Car(120.0); // Maximum speed of 120 mph

        car.setTargetSpeed(70.0);
        if (car.turnOnCruiseControl()) {
            System.out.println("Cruise control is on.\nTarget Speed: " + car.targetSpeed + " mph");
        } else {
            System.out.println("Cruise control could not be turned on.");
        }

        car.accelerate(60.0);
        car.decelerate(10.0);

        System.out.println("Current speed: " + car.getCurrentSpeed());

        car.turnOffCruiseControl();
        System.out.println("Cruise control is off.");
    }
}
