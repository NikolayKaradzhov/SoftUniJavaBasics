import java.text.DecimalFormat;
import java.util.Scanner;

public class p11_OddEvenPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersCount = Integer.parseInt(scanner.nextLine());

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        double minEvenNumber = Double.MAX_VALUE;
        double minOddNumber = Double.MAX_VALUE;
        double maxEvenNumber = -Double.MAX_VALUE;
        double maxOddNumber = -Double.MAX_VALUE;
        double evenSum = 0.0;
        double oddSum = 0.0;

        for (int i = 1; i <= numbersCount; i++) {
            double currentNumber = Double.parseDouble(scanner.nextLine());
            boolean checkEven = i % 2 == 0;
            if (checkEven) {
                evenSum += currentNumber;
                if (currentNumber > maxEvenNumber) {
                    maxEvenNumber = currentNumber;
                }
                if (currentNumber < minEvenNumber) {
                    minEvenNumber = currentNumber;
                }
            } else {
                oddSum += currentNumber;
                if (currentNumber > maxOddNumber) {
                    maxOddNumber = currentNumber;
                }
                if (currentNumber < minOddNumber) {
                    minOddNumber = currentNumber;
                }
            }
        }

        System.out.println("OddSum=" + decimalFormat.format(oddSum));
        if (minOddNumber == Double.MAX_VALUE) {
            System.out.println("OddMin=No");
        } else {
            System.out.println("OddMin=" + decimalFormat.format(minOddNumber));
        }
        if (maxOddNumber == -Double.MAX_VALUE) {
            System.out.println("OddMax=No");
        } else {
            System.out.println("OddMax=" + decimalFormat.format(maxOddNumber));
        }

        System.out.println("EvenSum=" + decimalFormat.format(evenSum));
        if (minEvenNumber == Double.MAX_VALUE) {
            System.out.println("EvenMin=No");
        } else {
            System.out.println("EvenMin=" + decimalFormat.format(minEvenNumber));
        }
        if (maxEvenNumber == -Double.MAX_VALUE) {
            System.out.println("EvenMax=No");
        } else {
            System.out.println("EvenMax=" + decimalFormat.format(maxEvenNumber));
        }
    }
}
