package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());
        //The eat method was defined in Cat, but may be called on all HouseCat instances as well. We say: “HouseCat inherits the method eat() from Cat.”
        // We know we have successfully called eat() on garfield because the printed statement indicates the cat is now tired
    }
    }

