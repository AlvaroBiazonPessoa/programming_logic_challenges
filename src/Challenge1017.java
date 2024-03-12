import java.util.Scanner;

public class Challenge1017 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double consumptionKmL = 12.0;
        int timeSpentTravelingInHours = scanner.nextInt();
        int averageSpeedDuringTheTripInKmH = scanner.nextInt();
        double numberOfLitersOfFuel = timeSpentTravelingInHours * averageSpeedDuringTheTripInKmH / consumptionKmL;
        System.out.printf("%.3f\n", numberOfLitersOfFuel);
        scanner.close();
    }

}
