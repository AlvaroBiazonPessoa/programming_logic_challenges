import java.util.Scanner;

public class Challenge1011 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
        double ray = scanner.nextDouble();
        double sphereVolume = 4.0/3 * pi * Math.pow(ray, 3);
        System.out.printf("VOLUME = %.3f\n", sphereVolume);
    }

}
