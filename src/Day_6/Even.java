package Day_6;

import java.util.Scanner;

public class Even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        while(start <= end ) {

            if(start%2 == 0){
                System.out.println(start);
            }
            start++;
        }
    }
}

