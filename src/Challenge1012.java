import java.util.Scanner;

public class Challenge1012 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double areaOfRightTriangle = 1/2.0 * a * c;
        double areaOfTheCircle = pi * Math.pow(c, 2);
        double trapezoidArea = (a + b) * c / 2;
        double areaOfTheSquare = b * b;
        double areaOfTheRectangle = a * b;
        System.out.printf("TRIANGLE: %.3f\n", areaOfRightTriangle);
        System.out.printf("CIRCLE: %.3f\n", areaOfTheCircle);
        System.out.printf("TRAPEZUS: %.3f\n", trapezoidArea);
        System.out.printf("SQUARE: %.3f\n", areaOfTheSquare);
        System.out.printf("RECTANGLE: %.3f\n", areaOfTheRectangle);
        scanner.close();
    }

}
