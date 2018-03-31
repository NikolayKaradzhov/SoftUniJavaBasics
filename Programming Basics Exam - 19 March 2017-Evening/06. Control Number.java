import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

public class ControlNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int controlSum = Integer.parseInt(scanner.nextLine());

        int movesCount = 0;
        int totalSum = 0;

        for (int i = 1; i <= firstNumber; i++) {
            for (int j = secondNumber; j >= 1; j--) {
                movesCount++;
                totalSum += (i * 2) + (j * 3);

                if (totalSum >= controlSum) {
                    System.out.printf("%d moves%n", movesCount);
                    System.out.printf("Score: %d >= %d", totalSum, controlSum);
                    return;
                }
            }
        }
        System.out.printf("%d moves%n", movesCount);
    }
}
