import java.util.Scanner;

public class Challenge1002 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = 3.14159;
        double ray = scanner.nextDouble();
        double area = n * Math.pow(ray, 2);
        System.out.printf("A=%.4f\n", area);
        scanner.close();
    }

}
