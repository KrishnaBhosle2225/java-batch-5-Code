public class CompileTimePoly {

    //using diferent data types
    public int add(int a, int b) {
        return a+b;
    }

    public double add(double a, double b) {
        return a+b;
    }

    public int add(int a, int b, int c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        CompileTimePoly c1 = new CompileTimePoly();

        System.out.println(c1.add(10,20));

        System.out.println(c1.add(10.4,20.6));

        System.out.println(c1.add(1,2,3));
    }

}
