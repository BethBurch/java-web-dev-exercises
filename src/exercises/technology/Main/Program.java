package exercises.technology.Main;

public class Program {
    //Implement your design and test it in a Program.java class.
    public static void main(String[] args) {
        SmartPhone mySmartPhone = new SmartPhone( 600,17, "apple", true);
        //call the method
        mySmartPhone.makePhoneCall("513-623-2639");
        //Call the method from Parent Computer
        int result = mySmartPhone.canDoMath();
        System.out.println("phone result" + result);

        Laptop myLaptop = new Laptop( 12000,19,"Toshiba",false);
        myLaptop.intelliJisOpen();
        int results = myLaptop.canDoMath();
        System.out.println("laptop result is" + results);

        Computer myComputer = new Computer ( 20000,27,"Macintosh");
        int computerResult = myComputer.canDoMath();
        System.out.println("Computer results" + computerResult);

    }
}
