package Day_10;

//parent
//|
//child
public class Parent {

    void m1() {
        System.out.println("I am Parent Class");
    }
}

class Child extends Parent{
    void m2() {
        System.out.println("I am in Child class");
    }

    public static void main(String[] args) {
//        Child c1= new Child();
//        c1.m1();
//        c1.m2();

        Parent p1 = new Parent();
        p1.m1();

    }
}
