package Revision;

public class looping2 {

    public static void main(String[] args) {

        //for loop
        for(int i=0;i<=10;i++) {
            System.out.println(i);
        }


        //while loop
//        int i = 20;  //initialization
//        while(i<=10) {
//            System.out.println(i);
//            i++;
//        }

        //do-while loop
//        int i=20;
//        do {
//            System.out.println(i);
//            i++;
//        }while(i<=10);

        //use of break
//        for(int i=0;i<=10;i++) {
//            if(i == 5)
//                break;
//            System.out.println(i);
//        }

        //example of continue
        for(int i=0;i<=10;i++) {
            if(i == 5)
                continue;
            System.out.println(i);
        }
    }
}
