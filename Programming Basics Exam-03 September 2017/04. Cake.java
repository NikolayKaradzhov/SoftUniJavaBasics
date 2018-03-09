import java.util.Scanner;

public class p04_03September2017_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeWidth = Integer.parseInt(scanner.nextLine());
        int cakeLenght = Integer.parseInt(scanner.nextLine());
        String text = scanner.nextLine();

        int cakeArea = cakeLenght * cakeWidth;

        while (!"STOP".equals(text)) {
            int cakePieces = Integer.parseInt(text);
            cakeArea = cakeArea - cakePieces;

            if (cakeArea < 0) {
                int neededPieces = Math.abs(cakeArea);
                System.out.printf("No more cake left! You need %d pieces more.%n", neededPieces);
                break;
            }
            text = scanner.nextLine();
        }
        if (cakeArea > 0)
            System.out.printf("%d pieces are left.%n", cakeArea);
    }
}
