// ALL DONE EXCEPT TASK 5 ( SHOPPING LIST )

import java.util.*;

public class GroceryList {
    private Map<String, List<String>> categorizedGroceryList = new HashMap<>();
    private Map<String, Double> itemCosts = new HashMap<>();
    private Map<String, Integer> itemQuantities = new HashMap<>();

    public void addItemWithCategory(String item, String category, double cost, int quantity) {
        if (!categorizedGroceryList.containsKey(category)) {
            categorizedGroceryList.put(category, new ArrayList<>());
        }

        if (!itemCosts.containsKey(item)) {
            itemCosts.put(item, cost);
            itemQuantities.put(item, quantity);
            categorizedGroceryList.get(category).add(item);
        } else {
            System.out.println("Item already exists!");
        }
    }

    public void addItemWithQuantity(String item, int quantity) {
        if (itemCosts.containsKey(item)) {
            int currentQuantity = itemQuantities.get(item);
            itemQuantities.put(item, currentQuantity + quantity);
        } else {
            System.out.println("Item not found in the grocery list.");
        }
    }

    public void updateQuantity(String item, int newQuantity) {
        if (itemQuantities.containsKey(item)) {
            itemQuantities.put(item, newQuantity);
        } else {
            System.out.println("Item not found in the grocery list.");
        }
    }

    public void displayAvailableItems() {
        System.out.println("Available Items:");
        System.out.println(" ");
        for (Map.Entry<String, Integer> entry : itemQuantities.entrySet()) {
            String item = entry.getKey();
            int quantity = entry.getValue();
            double cost = itemCosts.get(item);
            if (quantity > 0) {
                System.out.println(item + " = Cost: " + cost + " - Quantity: " + quantity);
            }
        }
    }

    public void removeItem(String item) {
        if (itemCosts.containsKey(item)) {
            String category = getCategoryOfItem(item);
            itemCosts.remove(item);
            itemQuantities.remove(item);
            categorizedGroceryList.get(category).remove(item);
            System.out.println(item + " has been removed from the grocery list.");
        } else {
            System.out.println(item + " is not in the grocery list.");
        }
    }

    public void displayList() {
        if (categorizedGroceryList.isEmpty()) {
            System.out.println("The grocery list is empty.");
        } else {
            int itemNumber = 1; // Initialize item number
            System.out.println("Grocery List:");
            System.out.println(" ");
            for (String category : categorizedGroceryList.keySet()) {
                System.out.println("Category: " + category);
                displayByCategory(category, itemNumber);
                itemNumber += categorizedGroceryList.get(category).size(); // Increment item number
            }
        }
    }


    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (String item : itemCosts.keySet()) {
            double cost = itemCosts.get(item);
            int quantity = itemQuantities.get(item);
            totalCost += cost * quantity;
        }
        return totalCost;
    }

    public boolean checkItem(String item) {
        return itemCosts.containsKey(item);
    }

    public void displayByCategory(String category, int itemNumber) {
        if (categorizedGroceryList.containsKey(category)) {
            List<String> itemsInCategory = categorizedGroceryList.get(category);
            for (String item : itemsInCategory) {
                double cost = itemCosts.get(item);
                int quantity = itemQuantities.get(item);
                System.out.println(itemNumber + ". " + item + " = Cost: " + cost + " € - Quantity: " + quantity );
                System.out.println("-------------------------------------");
                itemNumber++; // Increment item number for each item
            }
        } else {
            System.out.println("Category not found: " + category);
        }
    }




    public String getCategoryOfItem(String item) {
        for (String category : categorizedGroceryList.keySet()) {
            if (categorizedGroceryList.get(category).contains(item)) {
                return category;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        GroceryList manager = new GroceryList();

        manager.addItemWithCategory("Apples", "Fruits", 2.99, 5);
        manager.addItemWithCategory("Milk", "Dairy", 1.99, 3);
        manager.addItemWithCategory("Bread", "Bakery", 2.49, 2);

        manager.addItemWithQuantity("Apples", 3);
        manager.updateQuantity("Milk", 5);

        System.out.println("≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈");

        manager.displayList();

        System.out.println("≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈");

        String itemToCheck = "Milk";
        System.out.println("Is \"" + itemToCheck + "\" in the grocery list? " + manager.checkItem(itemToCheck));

        String itemToRemove = "Milk";
        manager.removeItem(itemToRemove);

        System.out.println("≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈");

        manager.displayAvailableItems();

        double totalCost = manager.calculateTotalCost();
        System.out.printf("Total cost of items: %.2f € \n", totalCost);

        System.out.println("≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈");
    }
}
