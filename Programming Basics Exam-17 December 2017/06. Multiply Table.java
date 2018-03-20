import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int firstNum = n % 10;
        int secondNum = (n % 100) / 10;
        int lastNum = n / 100;

        for (int i = 1; i <= firstNum; i++) {
            for (int j = 1; j <= secondNum; j++) {
                for (int k = 1; k <= lastNum; k++) {
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, (i * j * k));
                }
            }
        }
    }
}

