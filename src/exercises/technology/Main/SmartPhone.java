package exercises.technology.Main;


public class SmartPhone extends Computer{

//    Class Variable
    private boolean isConnectedTo5G;

    public SmartPhone(int pixels,int screenSize,String make,boolean isConnectedTo5G){
        super(pixels, screenSize, make);
        this.isConnectedTo5G = isConnectedTo5G;
    }
    //Method

    public void makePhoneCall(String number) {
        System.out.println("Calling" + number);
    }
}
