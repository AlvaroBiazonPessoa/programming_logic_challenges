import java.util.Scanner;

public class Challenge1044 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean areTheyMultiple = a % b == 0 || b % a == 0;
        if (areTheyMultiple) {
            System.out.println("They are multiple");
        } else {
            System.out.println("They are not multiple");
        }
    }

}
