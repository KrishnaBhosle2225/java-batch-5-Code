package Day_10;

public class First {

    void add(int a, int b) {
        System.out.println("I am in First class");
        System.out.println(a+b);
    }
}

class Second extends  First {
    void add(int a, int b) {
        System.out.println("I am in Second class");
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        //simple object creation
        Second s1 = new Second();

        s1.add(10, 20);
    }
}
