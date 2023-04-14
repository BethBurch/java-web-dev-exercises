package exercises.technology.Main;

public class Laptop extends Computer {
    //Class Variables
    private boolean isIntelliJOpened;

// Constructor
    /// SUPER MUST BE FIRST LINE UNDER CONSTRUCTOR
    public Laptop(int pixels,int screenSize,String make) {
        super(pixels, screenSize, make);
        this.isIntelliJOpened = false;
    }
    ///SUPER IS ADDED TO EVERY CONSTRUCTOR
    public Laptop(int pixels,int screenSize,String make, boolean isIntelliJOpened) {
        super(pixels, screenSize, make);
        this.isIntelliJOpened = false;
    }

//    Method
    public void intelliJisOpen() {
        //sets variable to true
        this.isIntelliJOpened= true;
        System.out.println("IntelliJ is Open");

    }
}
