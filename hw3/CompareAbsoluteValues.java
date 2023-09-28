package hw3;

public class CompareAbsoluteValues {

    static void compareAbsoluteValues(int a, int b) {
        if (Math.abs(a) > Math.abs(b)) {
            System.out.println(" has a greater absolute value");
        } else if (Math.abs(a) < Math.abs(b)) {
            System.out.println(b + " has a greater absolute value");
        } else {
            System.out.println("Values are equal");

        }

    }
}
