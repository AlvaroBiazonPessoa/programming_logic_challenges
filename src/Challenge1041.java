import java.util.Scanner;

public class Challenge1041 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        boolean isThePointInTheFirstQuadrant = x > 0 && y > 0;
        boolean isThePointInTheSecondQuadrant = x < 0 && y > 0;
        boolean isThePointInTheThirdQuadrant = x < 0 && y < 0;
        boolean isThePointInTheFourthQuadrant = x > 0 && y < 0;
        boolean isThePointOnTheOrdinateAxis = x == 0 && y != 0;
        boolean isThePointOnTheAbscissaAxis = y == 0 && x != 0;
        boolean isThePointAtTheOrigin = x == 0 && y == 0;
        if (isThePointInTheFirstQuadrant) {
            System.out.println("Q1");
        } else if (isThePointInTheSecondQuadrant) {
            System.out.println("Q2");
        } else if (isThePointInTheThirdQuadrant) {
            System.out.println("Q3");
        } else if (isThePointInTheFourthQuadrant) {
            System.out.println("Q4");
        } else if (isThePointOnTheOrdinateAxis) {
            System.out.println("Axis Y");
        } else if (isThePointOnTheAbscissaAxis) {
            System.out.println("Axis X");
        } else if (isThePointAtTheOrigin) {
            System.out.println("Origin");
        }
    }

}
