import java.util.Scanner;

public class p10_Numbers100to200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());

        if (inputNumber < 100) {
            System.out.println("Less than 100");
        } else if (inputNumber >= 100 && inputNumber <= 200) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Greater than 200");
        }

    }
}
