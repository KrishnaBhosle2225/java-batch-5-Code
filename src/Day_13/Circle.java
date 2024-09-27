package Day_13;

abstract class Shape {

    abstract void printArea();

    abstract void printDiameter();

}
public class Circle extends Shape{
    @Override
    void printArea() {
        System.out.println("Area of circle");
    }

    @Override
    void printDiameter() {
        System.out.println("Diameter of circle");
    }

    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.printArea();
        s1.printDiameter();
    }
}
