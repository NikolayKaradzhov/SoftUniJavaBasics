import java.util.Scanner;

public class retirement_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String maleOrFemale = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int lenghtOfService = Integer.parseInt(scanner.nextLine());

        int requiredAgeF = 61;
        int requiredWorkF = 35;

        int requiredAgeM = 64;
        int requiredWorkM = 38;

        int diffInAgeF = requiredAgeF - age;
        int diffInAgeM = requiredAgeM - age;
        int diffInWorkF = requiredWorkF - lenghtOfService;
        int diffInWorkM = requiredWorkM - lenghtOfService;

        if ("female".equalsIgnoreCase(maleOrFemale)){
            if (age >= 61 && lenghtOfService >= 35) {
                System.out.printf("Ready to retire at %d and %d years of experience!", age, lenghtOfService);
            } else if (age < 61 && lenghtOfService >= 35) {
                System.out.printf("Worked enough, but not old enough. Years left to retirement: %d.", diffInAgeF);
            } else if (age >= 61 && lenghtOfService < 35) {
                System.out.printf("Old enough, but haven't worked enough. Work experience left to retirement: %d.", diffInWorkF);
            } else if (age < 61 && lenghtOfService < 35) {
                System.out.printf("Too early. Years left to retirement: %d. Work experience left to retirement: %d.", diffInAgeF,diffInWorkF);
            }
        } else if ("male".equalsIgnoreCase(maleOrFemale)) {
            if (age >= 64 && lenghtOfService >= 38) {
                System.out.printf("Ready to retire at %d and %d years of experience!", age, lenghtOfService);
            } else if (age < 64 && lenghtOfService >= 38) {
                System.out.printf("Worked enough, but not old enough. Years left to retirement: %d.", diffInAgeM);
            } else if (age >= 64 && lenghtOfService < 38) {
                System.out.printf("Old enough, but haven't worked enough. Work experience left to retirement: %d.", diffInWorkM);
            } else if (age < 64 && lenghtOfService < 38) {
                System.out.printf("Too early. Years left to retirement: %d. Work experience left to retirement: %d.", diffInAgeM, diffInWorkM);
            }
            } else {
            System.out.printf("Invalid input.");
        }
    }
}
