import java.util.Scanner;

public class p13_PointInTheFigure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        boolean isInHorizontal = (x > 0 && x < h * 3) && (y > 0 && y < h); // true or false
        boolean isInVertical = (x > h && x < h * 2) && (y > 0 && y < h * 4); // true or false

        boolean isOutOfHorizontal = (x < 0 || x > h * 3) && y <= h;
        boolean isOutOfVertical = ((x < h || x > h * 2) && y > h) || (y < 0 || y > h * 4);

        if (isInHorizontal || isInVertical){
            System.out.println("inside");
        } else if (isOutOfHorizontal || isOutOfVertical) {
            System.out.println("outside");
        } else {
            System.out.println("border");
        }
    }
}
