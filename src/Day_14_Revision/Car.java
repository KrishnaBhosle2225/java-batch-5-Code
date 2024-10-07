package Day_14_Revision;

public class Car {

    //1. it should have the same name as class name
    //2. it must not return any value
    //3. the contructor should be public
    //4. it gets called automatically when the object of class created

    //default contructor (no values taken)
    public Car() {
        System.out.println("I am in default constructor");
    }

    public Car(int price) {
        System.out.println("I am in parameterized constructor");
        System.out.println("My car price is "+ price);
    }

    public static void main(String[] args) {
        Car c1 = new Car(200000);
    }
}
