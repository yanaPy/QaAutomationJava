package hw3;

import java.util.Scanner;

public class PrintMonthInWord {

    static void printMonthInWord(int num) {
        if (num == 1) {
            System.out.println("JAN");
        } else if (num == 2) {
            System.out.println("FEB");
        } else if (num == 3) {
            System.out.println("MAR");
        } else if (num == 4) {
            System.out.println("APR");
        } else if (num == 5) {
            System.out.println("MAY");
        } else if (num == 6) {
            System.out.println("JUN");
        } else if (num == 7) {
            System.out.println("JUL");
        } else if (num == 8) {
            System.out.println("AUG");
        } else if (num == 9) {
            System.out.println("SEP");
        } else if (num == 10) {
            System.out.println("OCT");
        } else if (num == 11) {
            System.out.println("NOV");
        } else if (num == 12) {
            System.out.println("DEC");
        } else {
            System.out.println("Not a valid month");
        }
    }

    static void printMonthInWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of month: ");

        int num = sc.nextInt();

        switch (num) {
            case (1):
                System.out.println("JAN");
                break;
            case (2):
                System.out.println("FEB");
                break;
            case (3):
                System.out.println("MAR");
                break;
            case (4):
                System.out.println("APR");
                break;
            case (5):
                System.out.println("MAY");
                break;
            case (6):
                System.out.println("JUN");
                break;
            case (7):
                System.out.println("JUL");
                break;
            case (8):
                System.out.println("AUG");
                break;
            case (9):
                System.out.println("SEP");
                break;
            case (10):
                System.out.println("OCT");
                break;
            case (11):
                System.out.println("NOV");
                break;
            case (12):
                System.out.println("DEC");
                break;
            default:
                System.out.println("Not a valid month");
                break;
        }

    }
}
