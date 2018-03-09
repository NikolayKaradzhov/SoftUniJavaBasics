import java.util.Scanner;

public class WireNet05November2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lenghtGardenInMeters = Double.parseDouble(scanner.nextLine());
        double widthGardenInMeters = Double.parseDouble(scanner.nextLine());
        double heightNetInMeters = Double.parseDouble(scanner.nextLine());
        double priceNetFor1MeterInLeva = Double.parseDouble(scanner.nextLine());
        double weightNetForSqMNetInKg = Double.parseDouble(scanner.nextLine());

        double netInMetersToBuy = 2 * lenghtGardenInMeters + 2 * widthGardenInMeters;
        double netPrice = netInMetersToBuy * priceNetFor1MeterInLeva;
        double areaOfTheNet = netInMetersToBuy * heightNetInMeters;
        double weightOfTheNet = areaOfTheNet * weightNetForSqMNetInKg;

        System.out.printf("%.0f%n",netInMetersToBuy);
        System.out.printf("%.2f%n", netPrice);
        System.out.printf("%.3f",weightOfTheNet);

    }
}
