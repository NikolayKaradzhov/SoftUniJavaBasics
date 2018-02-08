import java.util.Scanner;

public class p08_2DRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
                    // Ot po golqmoto podadeno x izwadi po malkoto podadeno x
        double result1 = Math.max(x1, x2) - Math.min(x1, x2);
        // Ot po golqmoto podadeno y izwadi po malkoto podadeno y
        double result2 = Math.max(y1, y2) - Math.min(y1, y2);

        double area = result1 * result2;
        double perimeter = 2 * (result1 + result2);

        System.out.printf("%.2f%n %.2f", area, perimeter);

    }
}
