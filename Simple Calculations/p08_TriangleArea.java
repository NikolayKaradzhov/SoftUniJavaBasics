import java.util.Scanner;

public class p08_TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double area = a * h / 2;

        System.out.printf("Triangle Area = %.2f", area);
    }
}
