import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double investedSum = Double.parseDouble(scanner.nextLine());
        double months = Double.parseDouble(scanner.nextLine());

        double simpleInterestRate = investedSum;
        double complexInterestRate = investedSum;

        for (int i = 0; i < months; i++) {
            simpleInterestRate += investedSum * 3.0 / 100.0;
            complexInterestRate += complexInterestRate * 2.7 / 100.0;
        }

        System.out.printf("Simple interest rate: %.2f lv.%n", simpleInterestRate);
        System.out.printf("Complex interest rate: %.2f lv.%n", complexInterestRate);

        if (simpleInterestRate > complexInterestRate) {
            System.out.printf("Choose a simple interest rate. You will win %.2f lv.", simpleInterestRate - complexInterestRate);
        } else {
            System.out.printf("Choose a complex interest rate. You will win %.2f lv.", complexInterestRate - simpleInterestRate);
        }

    }
}
