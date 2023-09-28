package hw3;

public class TriangleIsoscelesCheck {

    static void triangleIsoscelesCheck(int sideOne, int sideTwo, int sideThree) {
        if (sideOne == sideTwo && sideOne != sideThree||
                sideTwo == sideThree && sideTwo != sideOne||
                sideThree == sideOne && sideThree != sideTwo){
            System.out.println("The triangle is isosceles");

        } else{
            System.out.println("The triangle isn`t isosceles");
        }
    }
}
