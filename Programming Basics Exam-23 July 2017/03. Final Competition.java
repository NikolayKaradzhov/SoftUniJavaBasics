import java.util.Scanner;

public class FinalCompetition_23072017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dancersCount = Double.parseDouble(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        double expencesInPercents = 0.0;
        double moneyBulgaria = 0.0;
        double moneyAbroad = 0.0;
        double moneyForCharity = 0.0;
        double leftMoney = 0.0;
        double moneyForDancers = 0.0;
        double result = 0.0;

        if ("summer".equalsIgnoreCase(season)) {
            if ("Abroad".equalsIgnoreCase(place)) {
                moneyAbroad = (dancersCount * points);
                result = (moneyAbroad * 0.5) + moneyAbroad;
                expencesInPercents = result - ( result * 0.1);
                moneyForCharity = expencesInPercents * 0.75;
                leftMoney = expencesInPercents - moneyForCharity;
                moneyForDancers = leftMoney / dancersCount;
                System.out.printf("Charity - %.2f%n", moneyForCharity);
                System.out.printf("Money per dancer - %.2f", moneyForDancers);
            } else if ("Bulgaria".equalsIgnoreCase(place)) {
                moneyBulgaria = dancersCount * points;
                expencesInPercents = moneyBulgaria - ( moneyBulgaria * 0.05);
                moneyForCharity = expencesInPercents * 0.75;
                leftMoney = expencesInPercents - moneyForCharity;
                moneyForDancers = leftMoney / dancersCount;
                System.out.printf("Charity - %.2f%n", moneyForCharity);
                System.out.printf("Money per dancer - %.2f", moneyForDancers);
            }
        } else if ("winter".equalsIgnoreCase(season)) {
            if ("Abroad".equalsIgnoreCase(place)) {
                moneyAbroad = (dancersCount * points);
                result = (moneyAbroad * 0.5) + moneyAbroad;
                expencesInPercents = result - ( result * 0.15);
                moneyForCharity = expencesInPercents * 0.75;
                leftMoney = expencesInPercents - moneyForCharity;
                moneyForDancers = leftMoney / dancersCount;
                System.out.printf("Charity - %.2f%n", moneyForCharity);
                System.out.printf("Money per dancer - %.2f", moneyForDancers);
            } else if ("Bulgaria".equalsIgnoreCase(place)) {
                moneyBulgaria = dancersCount * points;
                expencesInPercents = moneyBulgaria - (moneyBulgaria * 0.08);
                moneyForCharity = expencesInPercents * 0.75;
                leftMoney = expencesInPercents - moneyForCharity;
                moneyForDancers = leftMoney / dancersCount;
                System.out.printf("Charity - %.2f%n", moneyForCharity);
                System.out.printf("Money per dancer - %.2f", moneyForDancers);
            }
        }

    }
}
