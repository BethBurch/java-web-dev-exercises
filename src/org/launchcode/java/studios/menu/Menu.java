package org.launchcode.java.studios.menu;
import java.util.ArrayList;
import java.time.LocalDate;

public class Menu {

        private ArrayList<MenuItem> menuItems = new ArrayList<>();
        private LocalDate lastUpdated;

        // No constructor definition — allow for default constructor

        // TODO: Define getters and setters as needed
        public ArrayList<MenuItem> getMenuItems() {
                return menuItems;
        }


        // TODO: Define custom toString() method
        @Override
        public String toString() {
                StringBuilder italian = new StringBuilder();
                for (MenuItem item : menuItems) {
                        if (item.getCategory().equals("Italian")) {
                                italian.append("\n" + item.toString() + "\n");
                        }
                }
                StringBuilder colombian = new StringBuilder();
                for (MenuItem item : menuItems) {
                        if (item.getCategory().equals("Colombian")) {
                                colombian.append("\n" + item.toString() + "\n");
                        }
                }
                StringBuilder desserts = new StringBuilder();
                for (MenuItem item : menuItems) {
                        if (item.getCategory().equals("Dessert")) {
                                desserts.append("\n" + item.toString() + "\n");
                        }
                }
                StringBuilder weird = new StringBuilder();
                for (MenuItem item : menuItems) {
                        if (item.getCategory().equals("Weird")) {
                                weird.append("\n" + item.toString() + "\n");
                        }
                }
                return "\nTONY'S PIZZA MENU\n" +
                        "ITALIAN" + italian.toString() + "\n" +
                        "COLOMBIAN" + colombian.toString() + "\n" +
                        "DESSERTS" + desserts.toString() + "\n" +
                        "WEIRD" + weird.toString() + "\n";
        }

        // TODO: Define addItem()
        // Make sure to update lastUpdated anytime something is successfully added
        // BONUS MISSION: prevent addition of duplicates
        void addItem(MenuItem newItem) {
                String message = "That item has already been added to the menu.";
                if (menuItems.contains(newItem)) {
                        System.out.println(message);
                        return;
                }
                for (MenuItem item : menuItems) {
                        if (item.equals(newItem)) {
                                System.out.println(message);
                                return;
                        }
                }
                menuItems.add(newItem);
                lastUpdated = LocalDate.now();
        }

        // TODO: Define removeItem()
        // Make sure to update lastUpdated anytime something is removed
        void removeItem(MenuItem item) {
                menuItems.remove(item);
                lastUpdated = LocalDate.now();
        }

}