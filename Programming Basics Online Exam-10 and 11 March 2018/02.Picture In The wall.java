import java.util.Scanner;

public class pictureInTheWall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int holeWidth = Integer.parseInt(scanner.nextLine());
        int holeLenght = Integer.parseInt(scanner.nextLine());
        int pictureSide = Integer.parseInt(scanner.nextLine());
        int picturesCount = Integer.parseInt(scanner.nextLine());

        int areaOfTheHole = holeLenght * holeWidth;
        int picturesArea = ( pictureSide * pictureSide) * picturesCount;

        int picturesAndHoleDiff = Math.abs(areaOfTheHole - picturesArea);

        if (areaOfTheHole > picturesArea) {
            System.out.printf("The pictures fit in the hole. Hole area is %d bigger than pictures area.", picturesAndHoleDiff);
        } else {
            System.out.printf("The pictures don't fit in the hole. Picture area is %d bigger than hole area.", picturesAndHoleDiff);
        }

    }
}
