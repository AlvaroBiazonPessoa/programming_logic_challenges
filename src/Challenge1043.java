import java.util.Scanner;

public class Challenge1043 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        boolean isItATriangle = ((a + b) > c) && ((a + c) > b) && ((b + c) > a);
        if (isItATriangle) {
            double perimeterOfTheTriangle = a + b + c;
            System.out.printf("Perimeter of the triangle = %.1f\n", perimeterOfTheTriangle);
        } else {
            double areaOfTheTrapezoid = (a + b) * c / 2.0;
            System.out.printf("Area of the trapezoid = %.1f\n", areaOfTheTrapezoid);
        }
        scanner.close();
    }

}
