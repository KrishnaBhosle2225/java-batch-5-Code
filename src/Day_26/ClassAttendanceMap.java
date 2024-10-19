package Day_26;


import java.util.HashMap;
import java.util.Map;

public class ClassAttendanceMap {

    public static void main(String[] args) {

        Map<Integer, String> m1 = new HashMap<>();

        m1.put(1,"Siddhi");
        m1.put(2,"Shreya");
        m1.put(3,"Yash");
        m1.put(4,"Krishna");

        System.out.println(m1);

        for( String names : m1.values()) {
            System.out.println(names);
        }
    }
}
