import java.util.Scanner;

public class Challenge1016 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distanceInKm = scanner.nextInt();
        int timeInMinutes = distanceInKm * 2;
        System.out.println(timeInMinutes + " minutes");
        scanner.close();
    }

}
