package Day_8;

public class Sum {


    //default constructor
    public Sum() {
        System.out.println("I am in the Default constructor");
    }

    //parameterized constructor
    public Sum(int a, int b, int c) {
        System.out.println("I am in parameterized constructor");
        System.out.println(a+b+c);
    }
    //void return type
    void add(int a, int b) {
        int c = a+b;
        System.out.println(c);
    }

    //int return type
    public int sub(int a, int b) {
        return a-b;
    }

    //String return type
    public String greeting(String name, int year, char grade) {
        String msg = "My name is "+name+" I am in" +year+ "year, my grade is "+grade;

        return msg;
    }

    public static void main(String[] args) {

        Sum s1 = new Sum();
        Sum s2 = new Sum(10,20,30);
        s1.add(10, 20);

        int c = s1.sub(100, 50);
//        System.out.println(c);

        String greeting = s1.greeting("Ankita", 3, 'A');
        System.out.println(greeting);
    }
}