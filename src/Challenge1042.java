import java.util.Arrays;
import java.util.Scanner;

public class Challenge1042 {

    public static void printValuesFromAnArray(int array[]) {
        for (int counter = 0; counter < array.length; counter++) {
            System.out.println(array[counter]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstValue = scanner.nextInt();
        int secondValue = scanner.nextInt();
        int thirdValue = scanner.nextInt();
        int unorderedValues[] = {firstValue, secondValue, thirdValue};
        int orderedValues[] = Arrays.copyOf(unorderedValues, unorderedValues.length);
        Arrays.sort(orderedValues);
        printValuesFromAnArray(orderedValues);
        printValuesFromAnArray(unorderedValues);
        scanner.close();
    }

}
