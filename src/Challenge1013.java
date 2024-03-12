import java.util.Scanner;

public class Challenge1013 {

    public static int calculateLarger(int a, int b) {
        return (a + b + Math.abs(a - b)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int greaterBetweenAB = calculateLarger(a, b);
        int greaterBetweenABC = calculateLarger(greaterBetweenAB, c);
        System.out.println(greaterBetweenABC + " is the biggest");
        scanner.close();
    }

}
