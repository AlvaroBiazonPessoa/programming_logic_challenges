import java.util.Scanner;

public class Challenge1018 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println(value);
        int[] typesOfNotes = {100, 50, 20, 10, 5, 2, 1};
        for (int counter = 0; counter < typesOfNotes.length; counter++) {
            int quantityOfNotes = value / typesOfNotes[counter];
            value %= typesOfNotes[counter];
            System.out.println(quantityOfNotes + " note(s) of R$ " + typesOfNotes[counter] + ",00");
        }
        scanner.close();
    }

}
