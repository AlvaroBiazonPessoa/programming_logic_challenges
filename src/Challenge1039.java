import java.util.Scanner;

public class Challenge1039 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float grade1 = scanner.nextFloat();
        float grade2 = scanner.nextFloat();
        float grade3 = scanner.nextFloat();
        float grade4 = scanner.nextFloat();
        float weightOfGrade1 = 2.0F;
        float weightOfGrade2 = 3.0F;
        float weightOfGrade3 = 4.0F;
        float weightOfGrade4 = 1.0F;
        float average = ((grade1 * weightOfGrade1) + (grade2 * weightOfGrade2) + (grade3 * weightOfGrade3) + (grade4 * weightOfGrade4))  / (weightOfGrade1 + weightOfGrade2 + weightOfGrade3 + weightOfGrade4);
        boolean approvedStudent = average >= 7.0;
        boolean failedStudent = average < 5.0;
        boolean doesTheStudentNeedToTakeAnExtraExam = average >= 5.0 && average <= 6.9;
        System.out.printf("Average: %.1f\n", average);
        if (approvedStudent) {
            System.out.println("Approved student.");
        } else if (failedStudent) {
            System.out.println("Failed student.");
        } else if (doesTheStudentNeedToTakeAnExtraExam) {
            System.out.println("Student taking exam.");
            float extraExamGrade = scanner.nextFloat();
            System.out.printf("Exam grade: %.1f\n", extraExamGrade);
            float finalAverage = (extraExamGrade + average) / 2;
            approvedStudent = finalAverage >= 5.0;
            failedStudent = finalAverage <= 4.9;
            if (approvedStudent) {
                System.out.println("Approved student.");
            } else if (failedStudent) {
                System.out.println("Failed student.");
            }
            System.out.printf("Final average: %.1f\n", finalAverage);
        }
        scanner.close();
    }

}
