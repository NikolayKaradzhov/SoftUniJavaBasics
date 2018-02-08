import java.util.Scanner;

public class p04_GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        if (num1 > num2) {
            System.out.printf("Greater number : %d", num1);
        } else {
            System.out.printf("Greater number : %d", num2);
        }

    }
}
