import java.util.Scanner;

public class ChristmasPreparation16122017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rollsPackingPaper = Double.parseDouble(scanner.nextLine());
        double platCount = Double.parseDouble(scanner.nextLine());
        double litersGlue = Double.parseDouble(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double totalPackingPaperRollsPrice = rollsPackingPaper * 5.80;
        double totalPlatPrice = platCount * 7.20;
        double gluePrice = litersGlue * 1.20;

        double totalAllMaterials = totalPackingPaperRollsPrice + totalPlatPrice + gluePrice;

        double totalPriceWithDiscount = totalAllMaterials - ((totalAllMaterials * discount) / 100);

        System.out.printf("%.3f", totalPriceWithDiscount);

    }
}
