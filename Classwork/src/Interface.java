// Data Structures
// August 29, 2024

public class Interface {
    public static void main(String []args){
        Fan myFan = new Fan("BestFans");
        myFan.turnOn();
        myFan.turnOff();
    }
}
// Interface
// Cannot inherit multiple classes, but you can implement multiple interfaces
interface Appliance {
    void turnOn();
    void turnOff();
}
class Fan implements Appliance {
    final String brand;
    Fan(String brand){
        this.brand = brand;
    }
    @Override
    public void turnOn(){
        System.out.println("This fan is now ON.");
    }
    @Override
    public void turnOff(){
        System.out.println("This fan is now OFF.");
    }
}

class TryCatchExample {
    public static void main(String[] args) {
        try{
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42/a;
            int[] c = {6};
            c[42] = 99;
        }
        catch(ArithmeticException e) {
            System.out.println("Divide by zero error: " + e);
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds error: " + e);
        }
        System.out.println("After try catch blocks");
    }
}