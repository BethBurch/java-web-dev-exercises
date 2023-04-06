package org.launchcode.java.studios.menu;

public class Restaurant {
    public static void main(String[] args) {
        //Create menu 5 menu items, using the menuitem class to intalize new objects.
        MenuItem item1 = new MenuItem( "Sudado de Polo", "Stewed Chicken and Potatoes",  15.99, "Colombian");
        MenuItem item2 = new MenuItem( "Flan", "Custard like cake/pudding", 10.00, "Dessert");
        MenuItem item3 = new MenuItem( "Pizza", "The Classic Cheese Pizza" ,15.99, "Italian");
        MenuItem item4 = new MenuItem( "Casava", "Similar to a Potato Stewed" ,8.00, "Colombian");
        MenuItem item5 = new MenuItem( "3 Way", "A Cincinnati Favorite Chilli and Spaghetti",16.99, "Weird");

        // TODO: Create a menu
        Menu menu = new Menu();

        // TODO: Add menu items to menu
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

//        System.out.println(menu.getMenuItems().size());

        // TODO: Print the entire menu
        System.out.println(menu);

        // TODO: Print just one menu item
        System.out.println(item1);

        // TODO: Remove an item and reprint menu
        menu.removeItem(item4);
        System.out.println(menu);

        // TODO: Test equals method
        System.out.println(item1.equals(item2));


        // BONUS MISSION

        // TODO: Try to add a duplicate
        MenuItem item6 = new MenuItem("Cake", "The Chocolate Cake (Its Real)", 4.59, "Dessert");
        menu.addItem(item6);
        System.out.println(menu);

    }
}
