import java.util.Scanner;

public class Challenge1037 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        boolean isTheValueInTheRangeBetween0and25 = value >= 0 && value <= 25.00;
        boolean isTheValueInTheRangeBetween2501and50 = value >= 25.01 && value <= 50.00;
        boolean isTheValueInTheRangeBetween5001and75 = value >= 50.01 && value <= 75.00;
        boolean isTheValueInTheRangeBetween7501and100 = value >= 75.01 && value <= 100.00;
        if (isTheValueInTheRangeBetween0and25) {
            System.out.println("Range [0,25]");
        } else if (isTheValueInTheRangeBetween2501and50) {
            System.out.println("Range (25,50]");
        } else if (isTheValueInTheRangeBetween5001and75) {
            System.out.println("Range (50,75]");
        } else if (isTheValueInTheRangeBetween7501and100) {
            System.out.println("Range (75,100]");
        } else {
            System.out.println("Out of range");
        }
        scanner.close();
    }

}
