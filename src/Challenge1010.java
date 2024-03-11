import java.util.Scanner;

public class Challenge1010 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstPieceCode = scanner.nextInt();
        int firstPieceQuantity = scanner.nextInt();
        double firstPieceValue = scanner.nextDouble();
        int secondPieceCode = scanner.nextInt();
        int secondPieceQuantity = scanner.nextInt();
        double secondPieceValue = scanner.nextDouble();
        double amountToPay = firstPieceQuantity * firstPieceValue + secondPieceQuantity * secondPieceValue;
        System.out.printf("Amount to pay: $ %.2f\n", amountToPay);
        scanner.close();
    }

}
