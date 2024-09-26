
package Day_12;//defining of package

import Day_6.Sum;
import Day_6.Demo;
public class Package_Basic {

    public static int roll_no;
//    public int roll_no = 20;
     String name = "Ascii Education";

    public void print() {
        System.out.println("Learning package concepts");
    }

    public static void main(String[] args) {

        Demo d1 = new Demo();
        d1.demo();

        Day_6.Even e1;
        Sum s1 = new Sum();
        System.out.println(s1.greeting("abc", 200, 'D'));
    }
}
