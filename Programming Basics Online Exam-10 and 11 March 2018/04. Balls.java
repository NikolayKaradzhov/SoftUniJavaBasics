import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int pointsRedBallsCount = 0;
        int pointsOrangeBallsCount = 0;
        int pointsYellowBallsCount = 0;
        int pointsWhiteBallsCount = 0;
        int pointsDividedCount = 0;
        int pointsFromOtherColoursCount = 0;
        int totalPoints = 0;

        for (int i = 0; i < n; i++) {
            String currentBallColour = scanner.nextLine();
            if ("red".equalsIgnoreCase(currentBallColour)) {
                totalPoints += 5;
                pointsRedBallsCount++;
            } else if ("orange".equalsIgnoreCase(currentBallColour)) {
                totalPoints += 10;
                pointsOrangeBallsCount++;
            } else if ("yellow".equalsIgnoreCase(currentBallColour)) {
                totalPoints += 15;
                pointsYellowBallsCount++;
            } else if ("white".equalsIgnoreCase(currentBallColour)) {
                totalPoints += 20;
                pointsWhiteBallsCount++;
            } else if ("black".equalsIgnoreCase(currentBallColour)) {
                totalPoints /= 2;
                pointsDividedCount++;
            } else {
                totalPoints = totalPoints;
                pointsFromOtherColoursCount++;
            }
        }
        System.out.printf("Total points: %d%n", totalPoints);
        System.out.printf("Points from red balls: %d%n", pointsRedBallsCount);
        System.out.printf("Points from orange balls: %d%n", pointsOrangeBallsCount);
        System.out.printf("Points from yellow balls: %d%n", pointsYellowBallsCount);
        System.out.printf("Points from white balls: %d%n", pointsWhiteBallsCount);
        System.out.printf("Other colors picked: %d%n", pointsFromOtherColoursCount);
        System.out.printf("Divides from black balls: %d%n", pointsDividedCount);
    }
}
