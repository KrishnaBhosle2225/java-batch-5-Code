package Day_4;

public class ConditionalStatements {

    public static void main(String[] args) {

        int a = 100;
        int b = 20;

        //if condition
        if(a < b)
            System.out.println("a is small");

//        if-else
        int age = 18;
        if(age > 18) {
            System.out.println("I will vote");
        }else if(age == 18){
            System.out.println("Your first voting");
        }
        else {
            System.out.println("I dont have vodting rights");
        }

        String Day = "Friday";

        switch (Day) {

            case "Monday":
                System.out.println("Today is monday!!");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday!!");
                break;
            case "Wednesday":
                System.out.println("Today is wednesday");
                break;
            case "Friday":
                System.out.println("Today is party day");
                break;
            case "Saturday":
                System.out.println("Saturday is chill day");
                break;
            case "Sunday":
                System.out.println("Tension Day");
                break;

            default:
                System.out.println("you dont exist");
        }

        //homework
//        months wise celebration name

    }
}
