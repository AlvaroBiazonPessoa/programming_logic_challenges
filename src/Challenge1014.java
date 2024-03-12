import java.util.Scanner;

public class Challenge1014 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalDistanceTraveled = scanner.nextInt();
        double totalFuelSpent = scanner.nextDouble();
        double averageCarConsumption = totalDistanceTraveled / totalFuelSpent;
        System.out.println(String.format("%.3f km/l", averageCarConsumption));
        scanner.close();
    }

}
