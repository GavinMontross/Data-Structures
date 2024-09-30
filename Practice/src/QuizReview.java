import java.util.Arrays;

public class QuizReview {
    public static int[] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length-1; i++){
            for(int j = 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(twoSum(arr, 13)));
    }
}

class Container {
    private int height;
    private int width;
    private int length;
    Container(int length, int width, int height){
        this.length = length;
        this.height = height;
        this.width = width;
    }
    Container(){
        height = -1;
        width = -1;
        length = -1;
    }
    Container(Container o){
        width = o.width;
        height = o.height;
        length = o.length;
    }
    public double volume(){
        return length*width*height;
    }
}

class Vehicle{
    String brand;
    Vehicle(String brand){
        this.brand = brand;
    }
    public void printBrand(){
        System.out.println("This vehicle is a " + brand);
    }
}
class Car extends Vehicle{
    String brand;
    String model;
    Car(String brand, String model){
        super(brand);
        this.model = model;
    }
    public void printBrand(){
        super.printBrand();
    }
    public void printModel(){
        System.out.println("This car's model is: " + model);
    }
}
