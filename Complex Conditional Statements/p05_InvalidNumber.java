import java.util.Scanner;

public class p05_InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        boolean isValid = (number  == 0) ||( (number >= 100) && (number <= 200)); // number is valid if number = 0, number between 100&200

        if (!isValid) {
            System.out.println("Invalid");
        }


    }
}
