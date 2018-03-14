import java.util.Scanner;

public class ArenaTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double points = Integer.parseInt(scanner.nextLine());
        String arenaName = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        String itemsCondition = scanner.nextLine();
        double discount = 0;
        double priceAllItemsAfterDiscount = 0;
        double allItems = 0;
        double priceForOneItem = 0;
        double itemsCount = 0;


        if ("Nagrand".equalsIgnoreCase(arenaName)) {
            if ("Monday".equalsIgnoreCase(dayOfWeek) || "Wednesday".equalsIgnoreCase(dayOfWeek)) {
                discount = 0.05;
            }
        } else if ("Gurubashi".equalsIgnoreCase(arenaName)) {
            if ("Tuesday".equalsIgnoreCase(dayOfWeek) || "Thursday".equalsIgnoreCase(dayOfWeek)) {
                discount = 0.1;
            }
        } else if ("Dire Maul".equalsIgnoreCase(arenaName)) {
            if ("Friday".equalsIgnoreCase(dayOfWeek) || "Saturday".equalsIgnoreCase(dayOfWeek)) {
                discount = 0.07;
            }
        }

        if ("Poor".equalsIgnoreCase(itemsCondition)) {
            allItems = 7000;
            priceAllItemsAfterDiscount = (allItems - (allItems * discount));
            priceForOneItem = (priceAllItemsAfterDiscount / 5);
        } else if ("Normal".equalsIgnoreCase(itemsCondition)) {
            allItems = 14000;
            priceAllItemsAfterDiscount = allItems - (allItems * discount);
            priceForOneItem = (priceAllItemsAfterDiscount / 5);
        } else if ("Legendary".equalsIgnoreCase(itemsCondition)) {
            allItems = 21000;
            priceAllItemsAfterDiscount = allItems - (allItems * discount);
            priceForOneItem = (priceAllItemsAfterDiscount / 5);
        }


        if (priceForOneItem < points) {
            points = points - priceForOneItem;
            itemsCount++;
        }
        if (priceForOneItem < points) {
            points = points - priceForOneItem;
            itemsCount++;
        }
        if (priceForOneItem < points) {
            points = points - priceForOneItem;
            itemsCount++;
        }
        if (priceForOneItem < points) {
            points = points - priceForOneItem;
            itemsCount++;
        }
        if (priceForOneItem < points) {
            points = points - priceForOneItem;
            itemsCount++;
        }
        if (itemsCount < 5) {
            System.out.printf("Items bought: %.0f%nArena points left: %.0f%nFailure!%n", itemsCount, points);
        } else {
            System.out.printf("Items bought: %.0f%nArena points left: %.0f%nSuccess!%n", itemsCount, points);
        }
    }
}
