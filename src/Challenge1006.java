import java.util.Scanner;

public class Challenge1006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gradeA = scanner.nextDouble();
        double gradeB = scanner.nextDouble();
        double gradeC = scanner.nextDouble();
        double weightOfGradeA = 2.0;
        double weightOfGradeB = 3.0;
        double weightOfGradeC = 5.0;
        double average = ((gradeA * weightOfGradeA) + (gradeB * weightOfGradeB) + (gradeC * weightOfGradeC)) / ((weightOfGradeA + weightOfGradeB + weightOfGradeC));
        System.out.printf("Average = %.1f\n", average);
        scanner.close();
    }

}
