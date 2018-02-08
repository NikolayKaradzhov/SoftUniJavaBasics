import java.util.Scanner;

public class p07_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; i++) {
            int currentNumberLeft = Integer.parseInt(scanner.nextLine());
            leftSum = leftSum + currentNumberLeft;
        }

        for (int i = 0; i < n; i++) {
            int currentNumberRight = Integer.parseInt(scanner.nextLine());
            rightSum = rightSum + currentNumberRight;
        }

        if (leftSum == rightSum) {
            System.out.println("Yes, sum = " + rightSum);
        } else {
            System.out.println("No, diff = " + Math.abs(leftSum - rightSum));
        }
    }

}
