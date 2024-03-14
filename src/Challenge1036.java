import java.util.Scanner;

public class Challenge1036 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double bhaskara = Math.pow(b, 2) - 4 * a * c;
        boolean isALessThanOrEqualTo0 = a <= 0;
        boolean isBhaskaraNegative = bhaskara < 0;
        if (isALessThanOrEqualTo0 || isBhaskaraNegative) {
            System.out.println("Impossible to calculate!");
        } else {
            double r1 = (-b + Math.sqrt(bhaskara)) / (2 * a);
            double r2 = (-b - Math.sqrt(bhaskara)) / (2 * a);
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }
    }

}
