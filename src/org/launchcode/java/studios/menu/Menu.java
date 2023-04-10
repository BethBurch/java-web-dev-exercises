package org.launchcode.java.studios.menu;

import java.util.ArrayList;
import java.time.LocalDate;

// Import the ArrayList and LocalDate classes from the Java util package.
public class Menu {
    //Define the Menu class.
    private final ArrayList<MenuItem> menuItems = new ArrayList<>();
    // Declare a private ArrayList of MenuItem objects called menuItems.
    private LocalDate lastUpdated;
    //Declare a private LocalDate object called lastUpdated.
    // No constructor definition — allow for default constructor

    // TODO: Define getters and setters as needed
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
//        Define the default constructor for the Menu class.
//Define getter methods for the menuItems and lastUpdated fields.
    // TODO: Define custom toString() method
//        Creates four StringBuilder objects: italian, colombian, desserts, and weird.
//   b. Loops through each MenuItem object in the menuItems ArrayList.
    @Override
    public String toString() {
        StringBuilder italian = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("Italian")) {
                italian.append("\n" + item + "\n");
            }
        }
        StringBuilder colombian = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("Colombian")) {
                colombian.append("\n" + item + "\n");
            }
        }

        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("Dessert")) {
                desserts.append("\n" + item + "\n");
            }
//   If the MenuItem's category is "Dessert", append its string representation to the desserts StringBuilder.
        }
        StringBuilder weird = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("Weird")) {
                weird.append("\n" + item + "\n");
            }
        }
        return "\nTONY'S PIZZA MENU\n" +
                "ITALIAN" + italian + "\n" +
                "COLOMBIAN" + colombian + "\n" +
                "DESSERTS" + desserts + "\n" +
                "WEIRD" + weird + "\n";
    }

    // TODO: Define addItem()
//        // Add a new menu item to the menu
    void addItem(MenuItem newItem) {
        // Check if the menu item has already been added
        String message = "That item has already been added to the menu.";
        if (menuItems.contains(newItem)) {
                // Display error message and return
            System.out.println(message);
            return;
        }
        // Check if there is another menu item with the same name and description

        for (MenuItem item : menuItems) {
            if (item.equals(newItem)) {
                System.out.println(message);
                return;
            }
        }
        // If the menu item is unique, add it to the menu and update the lastUpdated field

        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
    }

    // TODO: Define removeItem()
    // Make sure to update lastUpdated anytime something is removed
    // Remove a menu item from the menu

    void removeItem(MenuItem item) {
        // Remove the item from the menu and update the lastUpdated field

        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }

}