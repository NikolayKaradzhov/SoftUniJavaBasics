import java.util.Scanner;

public class AlcoholMarket07May2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double whiskeyPrice = Double.parseDouble(scanner.nextLine());
        double beerQuantity = Double.parseDouble(scanner.nextLine());
        double wineQuantity = Double.parseDouble(scanner.nextLine());
        double rakiaQuantity = Double.parseDouble(scanner.nextLine());
        double whiskeyQuantity = Double.parseDouble(scanner.nextLine());

        double rakiaPrice = whiskeyPrice / 2;
        double winePrice = rakiaPrice - (0.4 * rakiaPrice);
        double beerPrice = rakiaPrice - (0.8 * rakiaPrice);

        double rakiaSum = rakiaQuantity * rakiaPrice;
        double wineSum = wineQuantity * winePrice;
        double beerSum = beerQuantity * beerPrice;
        double whiskeySum = whiskeyQuantity * whiskeyPrice;

        double totalSum = rakiaSum + wineSum + beerSum + whiskeySum;

        System.out.printf("%.2f", totalSum);
    }
}
