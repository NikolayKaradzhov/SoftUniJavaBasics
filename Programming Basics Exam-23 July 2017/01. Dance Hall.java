import java.util.Scanner;

public class DanceHall_23072017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lenghtOfTheHall = Double.parseDouble(scanner.nextLine());
        double widthOfTheHall = Double.parseDouble(scanner.nextLine());
        double wardrobeSide = Double.parseDouble(scanner.nextLine());

        double hallSizeInSqcm = (lenghtOfTheHall * 100) * (widthOfTheHall * 100);
        double wardrobeSize = (wardrobeSide * 100) * (wardrobeSide * 100);
        double benchSize = hallSizeInSqcm / 10;

        double freeSpace = hallSizeInSqcm - wardrobeSize - benchSize;

        double dancersCount = Math.floor((freeSpace / (40 + 7000) * 1.0));

        System.out.printf("%.0f",dancersCount);
    }
}
