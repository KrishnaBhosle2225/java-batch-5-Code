package Day_9;

import java.util.Scanner;

public class SimpleCalculatorUsing_Switch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        System.out.println("Enter First Number: " + first );
        int second = scanner.nextInt();
        System.out.println("Enter Second Number: " + second );

        String operation = scanner.next();
        System.out.println("Enter Operation you want: " + operation );

        switch (operation) {
            case "+":
                System.out.println(first+second);
                break;

            case "-":
                System.out.println(first-second);
                break;

            case "*":
                System.out.println(first*second);
                break;

            case "/":
                System.out.println(first/second);
                break;

            default:
                System.out.println("Invalid operation");

        }
    }
}
