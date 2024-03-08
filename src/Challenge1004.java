import java.util.Scanner;

public class Challenge1004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstValue = scanner.nextInt();
        int secondValue = scanner.nextInt();
        int product = firstValue * secondValue;
        System.out.println("PROD = " + product);
        scanner.close();
    }

}
