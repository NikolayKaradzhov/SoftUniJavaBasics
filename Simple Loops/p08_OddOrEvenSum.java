import java.util.Scanner;

public class p08_OddOrEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int oddSum = 0;
        int evenSum = 0;


        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum = evenSum + currentNumber;
            } else {
                oddSum = oddSum + currentNumber;
            }
        }
        int diff = Math.abs(oddSum - evenSum);
        if (diff != 0) {
            System.out.printf("No%nDiff = %d", diff);
        } else {
            System.out.printf("Yes%nSum = %d", oddSum);
        }
    }
}

