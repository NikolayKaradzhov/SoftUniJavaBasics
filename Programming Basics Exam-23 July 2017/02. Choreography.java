import java.util.Scanner;

public class Choreography23072017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double stepsCount = Double.parseDouble(scanner.nextLine());
        double dancersCount = Double.parseDouble(scanner.nextLine());
        double daysForLearning = Double.parseDouble(scanner.nextLine());

        double stepsLearnedPerDay = (stepsCount / daysForLearning) / stepsCount;
        double stepsLearnedPerDayPercent = Math.ceil(stepsLearnedPerDay * 100.0);

        double percentStepsForDancer = stepsLearnedPerDayPercent / dancersCount;


        if (stepsLearnedPerDayPercent <= 13) {
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", percentStepsForDancer);
        } else {
            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.",percentStepsForDancer);
        }

    }
}
