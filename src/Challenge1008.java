import java.util.Scanner;

public class Challenge1008 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employeeNumber = scanner.nextInt();
        int numberOfHoursWorked = scanner.nextInt();
        double valuePerHoursWorked = scanner.nextDouble();
        double salary = numberOfHoursWorked * valuePerHoursWorked;
        System.out.println("NUMBER = " + employeeNumber);
        System.out.printf("SALARY = U$ %.2f\n", salary);
        scanner.close();
    }

}
