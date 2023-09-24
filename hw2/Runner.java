package hw2;

public class Runner {

    static void printText() {
        System.out.println("First program: ");
        System.out.println("Text text text\n");

        System.out.println("------");

    }

    static void degreeConverter(double celsius) {

        System.out.println("Second program: ");

        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.16;

        System.out.println(celsius + " Celsius: \n" + fahrenheit +
                " Fahrenheit; \n" + kelvin + " Kelvin.\n");
    }

    static void calcRectangleArea(int a, int b) {

        System.out.println("Third program: ");

        double s = 0.5 * a * b;
        System.out.println("S = " + s);
    }

    public static void main(String[] args) {

        printText();
        degreeConverter(28);
        calcRectangleArea(21, 27);

    }
}
