import java.util.Scanner;

public class p13_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFigure = scanner.nextLine();
        double a = Double.parseDouble(scanner.nextLine());

        if (typeOfFigure.equals("square")) {
            System.out.println(a * a);
        } else if (typeOfFigure.equals("rectangle")) {
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println(a * b);
        } else if (typeOfFigure.equals("circle")) {
            System.out.println(Math.PI * a * a);
        } else if (typeOfFigure.equals("triangle")) {
            double h = Double.parseDouble(scanner.nextLine());
            System.out.println(a * h / 2);
        }

    }
}
