import java.util.Scanner;

public class Challenge1009 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commissionOnSale = 15;
        String sellersName = scanner.nextLine();
        double fixedSalary = scanner.nextDouble();
        double totalSalesMadeInTheMonth = scanner.nextDouble();
        double total = fixedSalary + commissionOnSale / 100.00 * totalSalesMadeInTheMonth;
        System.out.printf("TOTAL = R$ %.2f\n", total);
        scanner.close();
    }

}
