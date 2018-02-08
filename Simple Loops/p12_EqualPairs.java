import java.util.Scanner;

public class p12_EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int previousSum = 0;
        int currentSum = 0;
        int maxDiff = 0;

        for (int i = 0; i < n; i++) {
            int firstNumber = Integer.parseInt(scanner.nextLine());
            int secondNumber = Integer.parseInt(scanner.nextLine());
            if (i == 0) {
                previousSum = firstNumber + secondNumber;
            } else {
                currentSum = firstNumber + secondNumber;
                if (Math.abs(currentSum - previousSum) > maxDiff) {
                    maxDiff = Math.abs(currentSum - previousSum);
                }
                previousSum = currentSum;
            }
        }
            if (maxDiff == 0) {
                System.out.printf("Yes, value=%d",previousSum);
            } else {
                System.out.printf("No, maxdiff=%d",maxDiff);
            }
    }
}
