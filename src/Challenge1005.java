import java.util.Scanner;

public class Challenge1005 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gradeA = scanner.nextDouble();
        double gradeB = scanner.nextDouble();
        double weightOfGradeA = 3.5;
        double weightOfGradeB = 7.5;
        double average = ((gradeA * weightOfGradeA) + (gradeB * weightOfGradeB)) / (weightOfGradeA + weightOfGradeB);
        System.out.printf("MEDIA = %.5f\n", average);
        scanner.close();
    }

}
