package Revision;

public class If_else {

    public static void main(String[] args) {

        int a = 100;
        int b=20;

//        if(a < b){
//            System.out.println("a is smaller");
//        }else {
//            System.out.println("B is greater");
//        }

        int month = 15;

        switch (month){
            case 1:
                System.out.println("January month");
                break;
            case 2:
                System.out.println("February month");
                break;
            case 3:
                System.out.println("March month");
                break;
            case 4:
                System.out.println("April month");
                break;
            case 5:
                System.out.println("May month");
                break;
            case 6:
                System.out.println("June month");
                break;
            case 7:
                System.out.println("July month");
                break;
            case 8:
                System.out.println("August month");
                break;
            default:
                System.out.println("Invalid month");
        }


    }
}
