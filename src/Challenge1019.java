import java.util.Scanner;

public class Challenge1019 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int numberOfSecondsInAMinute = 60;
        int numberOfMinutesInAnHour = 60;
        int numberOfSecondsInAnHour = numberOfSecondsInAMinute * numberOfMinutesInAnHour;
        int hours = seconds / numberOfSecondsInAnHour;
        int minutes = seconds % numberOfSecondsInAnHour / numberOfSecondsInAMinute;
        seconds %= numberOfSecondsInAMinute;
        System.out.println(hours + ":" + minutes + ":" + seconds);
        scanner.close();
    }

}
