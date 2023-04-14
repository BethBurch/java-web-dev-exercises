package exercises.technology.Main;

public class Computer {
    // For a parent class add 3 properties, 2 methods, and a constructor

    //    Variables or Properties
    private int pixels;
    private int screenSize;
    private String make;

    //    Constructor
    public Computer(int pixels,int screenSize,String make) {
        this.make = make;
        this.pixels = pixels;
        this.screenSize = screenSize;
    }
//    Methods


    public int getPixels() {
        return this.pixels;
    }

    public int getScreenSize() {
        return this.screenSize;
    }

    public String getMake() {
        return this.make;
    }

    public int canDoMath() {
        return 2 * 10;
    }
    public void searchedForADog() {
        System.out.println("HEY ITS LADY");
    }
}
