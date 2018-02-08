import java.util.Scanner;

public class p09_CelsiusToFerenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius = Double.parseDouble(scanner.nextLine());
        double ferenheit = celsius * 1.8 + 32;

        System.out.printf("%.2f", ferenheit);

    }
}
