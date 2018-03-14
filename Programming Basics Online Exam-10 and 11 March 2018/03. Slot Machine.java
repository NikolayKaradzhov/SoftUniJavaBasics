import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budgetIvo = Double.parseDouble(scanner.nextLine());
        double chocolateCount = Double.parseDouble(scanner.nextLine());
        double milkCount = Double.parseDouble(scanner.nextLine());

        double chocolatePrice = 0.65;
        double milkLiterPrice = 2.70;
        double mandarinaPrice = 0.20;

        double totalChocolatePrice = chocolateCount * chocolatePrice;
        double totalMilkPrice = milkCount * milkLiterPrice;
        double totalMandarina = Math.floor(chocolateCount - (chocolateCount * 0.35));

        double totalMandarinaPrice = totalMandarina * 0.2;

        double totalSum = totalChocolatePrice + totalMilkPrice + totalMandarinaPrice;

        double totalEndFinalSum = budgetIvo - totalSum;

        if (budgetIvo >= totalSum) {
            System.out.printf("You got this, %.2f money left!", Math.abs(totalEndFinalSum));
        } else if (totalSum > budgetIvo)
            System.out.printf("Not enough money, you need %.2f more!", Math.abs(totalEndFinalSum));
        }

    }
