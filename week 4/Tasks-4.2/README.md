# Calculator Java Program

This simple Java program implements a basic calculator following the Model-View-Controller (MVC) pattern. The Calculator class serves as the model, providing methods for performing calculations.

## Calculator Class

```java
public class Calculator {
    private int currentValue;

    // Method to reset the calculator to zero
    public void reset() {
        currentValue = 0;
    }

    // Method to add an integer to the calculator
    public void add(int num) throws IllegalArgumentException {
        if (num < 0) {
            throw new IllegalArgumentException("Negative integers are not allowed");
        }
        currentValue += num;
    }

    // Method to return the current value of the calculator
    public int getCurrentValue() {
        return currentValue;
    }
}
