package hw3;

import java.util.Scanner;

public class CheckOddEven {

    static void checkOddEven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");

        int num = sc.nextInt();

        String result = num % 2 == 0 ? "Even number" : "Odd number";
        System.out.println(result);

//        if (num % 2 == 0) {
//            System.out.println("Even number");
//        } else if (num % 2 != 0) {
//            System.out.println("Odd number");
//        }
        System.out.println("BYE");
    }
}
