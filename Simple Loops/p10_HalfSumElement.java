import java.util.Scanner;

public class p10_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber > maxNum) {
             maxNum = currentNumber;
            }
            sum = sum + currentNumber;
        }
        if (sum - maxNum == maxNum) {
            System.out.printf("Yes,%n Sum = %d", maxNum);
        } else {
            System.out.printf("No,%n diff = %d", Math.abs(sum - maxNum - maxNum));
        }
    }
}
