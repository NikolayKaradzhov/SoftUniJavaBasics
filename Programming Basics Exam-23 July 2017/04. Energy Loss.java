import java.util.Scanner;

public class EnergyLoss23072017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trainingDays = Double.parseDouble(scanner.nextLine());
        double dancersCount = Double.parseDouble(scanner.nextLine());
        double waistedEnergyPerPerson = 0.0;
        double energyPercent = 0.0;
        double currentEnergy = 0.0;

        double energyDancers = 100 * dancersCount * trainingDays;

        for (int i = 1; i <= trainingDays; i++) {
            double trainingHours = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0 && trainingHours % 2 == 0) {
                waistedEnergyPerPerson = 68;
                energyPercent = dancersCount * waistedEnergyPerPerson;
            } else if (i % 2 != 0 && trainingHours % 2 == 0) {
                waistedEnergyPerPerson = 49;
                energyPercent = waistedEnergyPerPerson * dancersCount;
            } else if (i % 2 == 0 && trainingHours % 2 != 0) {
                waistedEnergyPerPerson = 65;
                energyPercent = waistedEnergyPerPerson * dancersCount;
            } else  {
                waistedEnergyPerPerson = 30;
                energyPercent = waistedEnergyPerPerson * dancersCount;
            }
            currentEnergy = currentEnergy + energyPercent;
        }
        double leftEnergy = energyDancers - currentEnergy;
        double leftEnergyPerDancer = leftEnergy / dancersCount / trainingDays;

        if (leftEnergyPerDancer > 50) {
            System.out.printf("They feel good! Energy left: %.2f", leftEnergyPerDancer);
        } else {
            System.out.printf("They are wasted! Energy left: %.2f", leftEnergyPerDancer);
        }
    }
}
