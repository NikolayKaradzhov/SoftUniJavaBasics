import java.util.Scanner;

public class p05_MaxNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNum = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num > maxNum) {
                maxNum = num;
            }
        }
        System.out.println("max = " + maxNum);
    }
}
