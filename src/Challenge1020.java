import java.util.Scanner;

public class Challenge1020 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageInDays = scanner.nextInt();
        int numberOfDaysInAYear = 365;
        int numberOfDaysInAMonth = 30;
        int ageInYears = ageInDays / numberOfDaysInAYear;
        ageInDays %= numberOfDaysInAYear;
        int ageInMonths = ageInDays / numberOfDaysInAMonth;
        ageInDays %= numberOfDaysInAMonth;
        System.out.println(ageInYears + " year(s)");
        System.out.println(ageInMonths + " month(s)");
        System.out.println(ageInDays + " day(s)");
        scanner.close();
    }

}
