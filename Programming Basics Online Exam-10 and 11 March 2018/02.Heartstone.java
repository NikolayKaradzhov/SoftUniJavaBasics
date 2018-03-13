import java.util.Scanner;

public class Heartstone_10_11march {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double timeForRest = Double.parseDouble(scanner.nextLine());
        double priceOnePackCards = Double.parseDouble(scanner.nextLine());
        double priceForOneAdventure = Double.parseDouble(scanner.nextLine());
        double cofeePrice = Double.parseDouble(scanner.nextLine());
        double coffeePause = 5;

        double restWithCoffee = timeForRest - coffeePause;
        double buyingPacksWithCards = 3 * 2;
        double buyingAdventures = 2 * 2;
        double timeForRelax = restWithCoffee - ( buyingAdventures + buyingPacksWithCards );

        double spentMoneyForPacks = 3 * priceOnePackCards;
        double spentMoneyForAdventures = 2 * priceForOneAdventure;

        double totalPrice = spentMoneyForAdventures + spentMoneyForPacks + cofeePrice;
        System.out.printf("%.2f%n", totalPrice);
        System.out.printf("%.0f", timeForRelax);

    }
}
