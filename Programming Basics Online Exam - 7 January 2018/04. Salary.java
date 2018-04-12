import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mainSalary = Double.parseDouble(scanner.nextLine());
        int time = Integer.parseInt(scanner.nextLine());
        String syndicate = scanner.nextLine();
        double yars = 0.0;

        for (int i = 1; i <= 100; i ++) {
            mainSalary += mainSalary * 0.06;
            if (i % 10 == 0 && i != 5) {
                mainSalary += 200;
            }else if (i % 5 == 0) {
                mainSalary += 100;
            }
            if ("yes".equalsIgnoreCase(syndicate) && ( i % 5 != 0 || i % 10 != 0)) {
                mainSalary = mainSalary - (mainSalary * 0.01);
            }
            if (i == time && mainSalary < 5000) {
                System.out.printf("Current salary: %.2f%n", mainSalary);
            } else if (mainSalary >= 5000 && time >= i) {
                System.out.println("Current salary: 5000.00");
                System.out.printf("%.0f more years to max salary.%n", yars);
                break;
            }
            if (mainSalary >= 5000) {
                System.out.printf("%.0f more years to max salary.%n", i - 1.0 - time);
                break;
            }
        }
    }
}
