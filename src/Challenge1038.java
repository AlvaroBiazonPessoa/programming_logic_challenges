import java.util.Scanner;

public class Challenge1038 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int itemCode = scanner.nextInt();
        int itemQuantity = scanner.nextInt();
        double total = 0.00;
        boolean isItAHotDog = itemCode == 1;
        boolean isItAXSalad = itemCode == 2;
        boolean isItAXBacon = itemCode == 3;
        boolean isItASimpleToast = itemCode == 4;
        boolean isItASoda = itemCode == 5;
        if (isItAHotDog) {
            double hotDogPrice = 4.00;
            total = itemQuantity * hotDogPrice;
            System.out.printf("Total: R$ %.2f\n", total);
        } else if (isItAXSalad) {
            double xSaladPrice = 4.50;
            total = itemQuantity * xSaladPrice;
            System.out.printf("Total: R$ %.2f\n", total);
        } else if (isItAXBacon) {
            double xBaconPrice = 5.00;
            total = itemQuantity * xBaconPrice;
            System.out.printf("Total: R$ %.2f\n", total);
        } else if (isItASimpleToast) {
            double simpleToastPrice = 2.00;
            total = itemQuantity * simpleToastPrice;
            System.out.printf("Total: R$ %.2f\n", total);
        } else if (isItASoda) {
            double sodaPrice = 1.50;
            total = itemQuantity * sodaPrice;
            System.out.printf("Total: R$ %.2f\n", total);
        }
        scanner.close();
    }

}
