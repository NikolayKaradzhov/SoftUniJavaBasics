import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double km = Double.parseDouble(scanner.nextLine());
        double beginKm = km;
        double totalKm = 0;
        double newTotal = 0;

        for (int i = 0; i < n; i++) {
            int currentKilometers = Integer.parseInt(scanner.nextLine());
            km = km + (km * currentKilometers) / 100.00;
            totalKm += km;
        }
        newTotal = totalKm + beginKm;
        boolean isMoreThan1000 = newTotal >= 1000;

        if (isMoreThan1000) {
            newTotal = newTotal - 1000;
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(newTotal));
        } else {
            newTotal = 1000 - newTotal;
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(newTotal));
        }
    }
}
