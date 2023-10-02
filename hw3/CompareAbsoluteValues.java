package hw3;

public class CompareAbsoluteValues {

    static void compareAbsoluteValues(int a, int b) {
        int valOne= Math.abs(a);
        int valTwo= Math.abs(b);

        if (valOne > valTwo) {
            System.out.println(valOne + " has a greater absolute value");
        } else if (valOne < valTwo) {
            System.out.println(valTwo + " has a greater absolute value");
        } else {
            System.out.println("Values are equal");
        }
    }
}
