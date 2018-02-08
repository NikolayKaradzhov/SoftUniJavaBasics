import java.util.Scanner;

public class p10_RadiansToDegreece {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radians = Double.parseDouble(scanner.nextLine());
        double degreece = radians * 180/Math.PI;

        System.out.println(Math.round(degreece));
    }
}
