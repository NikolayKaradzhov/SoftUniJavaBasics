import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distanceBetweenAB = Double.parseDouble(scanner.nextLine());
        double truckSpeed = Double.parseDouble(scanner.nextLine());
        double diffBetweenTwoVehiclesSpeed = Double.parseDouble(scanner.nextLine());

        double carSpeedInKmH = diffBetweenTwoVehiclesSpeed * 3.6;
        double carSpeedInKmHNew = carSpeedInKmH + truckSpeed;
        double truckTime = distanceBetweenAB / truckSpeed;
        double carTime = distanceBetweenAB / carSpeedInKmHNew;

        System.out.printf("The truck arrived after %.0f hours%n", Math.ceil(truckTime));
        System.out.printf("The car arrived after %.0f hours", Math.ceil(carTime));

    }
}
