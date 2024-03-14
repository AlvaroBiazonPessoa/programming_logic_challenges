import java.util.Scanner;

public class Challenge1035 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        boolean isBbiggerThanC = b > c;
        boolean isDbiggerThanA = d > a;
        int sumOfAandB = a + b;
        int sumOfCandD = c + d;
        boolean isTheSumOfCandDGreaterThanTheSumOfAandB = sumOfCandD > sumOfAandB;
        boolean areCandDPositive = c > 0 && d > 0;
        boolean isAEven = a % 2 == 0;
        if (isBbiggerThanC && isDbiggerThanA && isTheSumOfCandDGreaterThanTheSumOfAandB && areCandDPositive && isAEven) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }

}
