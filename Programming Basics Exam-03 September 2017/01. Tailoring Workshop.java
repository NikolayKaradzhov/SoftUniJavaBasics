import java.util.Scanner;

public class p01_03September2017_TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tablesCount = Integer.parseInt(scanner.nextLine());
        double lenghtInMeters = Double.parseDouble(scanner.nextLine());
        double widthInMeters = Double.parseDouble(scanner.nextLine());

        double coversTotalArea = tablesCount * (lenghtInMeters + 2 * 0.30) * (widthInMeters + 2 * 0.30);
        double totalAreaSquares = tablesCount * (lenghtInMeters / 2) * (lenghtInMeters / 2);

        double totalPriceInUSD = coversTotalArea * 7 + totalAreaSquares * 9;
        System.out.printf("%.2f USD%n", totalPriceInUSD);

        double totalPriceInLeva = totalPriceInUSD * 1.85;
        System.out.printf("%.2f BGN",totalPriceInLeva);


    }
}
