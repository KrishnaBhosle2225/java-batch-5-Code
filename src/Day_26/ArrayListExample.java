package Day_26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        l2.add(19);
        l2.add(12);
        l2.add(13);

        l1.add(121);
        l1.add(234);
        l1.add(543);
        l1.addAll(l2);

//        System.out.println(l1.get(0));

        Iterator iterator = l1.iterator();

        while(iterator.hasNext()) {

            System.out.println(iterator.next());
        }

//        l1.removeAll(l2);
        iterator = l1.iterator();

        while(iterator.hasNext()) {

            System.out.println(iterator.next());
        }

//        l1.clear();
        System.out.println(l1.size());

//        while(iterator.hasNext()) {
//
//            System.out.println(iterator.next());
//        }

        if(l1.contains(11) == true) {
            System.out.println("Yes, it is present");
        }else {
            System.out.println("No, it is not present");
        }

    }

}
