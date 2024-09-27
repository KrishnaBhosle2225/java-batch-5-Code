package Day_13;


abstract class Bike{
    abstract void run();
    abstract void name();
}
public class Honda extends Bike{
    @Override
    void run() {
        System.out.println("Bike is Running");
    }

    @Override
    void name() {

        }
    public static void main(String[] args) {
        Bike b1 = new Honda();
        b1.run();
        b1.name();
    }
}
