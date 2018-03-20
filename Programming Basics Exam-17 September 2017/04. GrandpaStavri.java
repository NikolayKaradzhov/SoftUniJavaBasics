import java.util.Scanner;

public class GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double daysCount = Double.parseDouble(scanner.nextLine());
        double totalLiters = 0.0;
        double totalDegree = 0.0;

        for (int i = 0; i < daysCount; i++) {
            double quantity = Double.parseDouble(scanner.nextLine());
            double degree = Double.parseDouble(scanner.nextLine());
            totalDegree += quantity * degree;
            totalLiters += quantity;
        }
        double totalDegreeFinal = totalDegree / totalLiters;
        if (totalDegreeFinal < 38) {
            System.out.printf("Liter: %.2f%n", totalLiters);
            System.out.printf("Degrees: %.2f%n", totalDegreeFinal);
            System.out.printf("Not good, you should baking!");
        } else if (totalDegreeFinal >= 38 && totalDegreeFinal <= 42) {
            System.out.printf("Liter: %.2f%n", totalLiters);
            System.out.printf("Degrees: %.2f%n", totalDegreeFinal);
            System.out.printf("Super!");
        } else if (totalDegreeFinal > 42){
            System.out.printf("Liter: %.2f%n", totalLiters);
            System.out.printf("Degrees: %.2f%n", totalDegreeFinal);
            System.out.printf("Dilution with distilled water!");
        }
    }
}
