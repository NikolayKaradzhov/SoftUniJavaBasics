import java.util.Scanner;

public class p02_03September2017_Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double incomeInLevaBGN = Double.parseDouble(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());
        double minimumSalary = Double.parseDouble(scanner.nextLine());

        int socialScholarship = -1;
        int excellentResultSholarship = -1;

        if (incomeInLevaBGN < minimumSalary & averageGrade > 4.50) {
            socialScholarship = (int) (minimumSalary * 0.35);
        }

        if (averageGrade >= 5.50) {
            excellentResultSholarship = (int)(averageGrade * 25);
        }

        if (socialScholarship == -1 && excellentResultSholarship == -1) {
            System.out.println("You cannot get a scholarship!");
        } else if (socialScholarship > excellentResultSholarship) {
            System.out.printf("You get a Social scholarship %d BGN%n", socialScholarship);
        } else {
            System.out.printf("You get a scholarship for excellent results %d BGN%n", excellentResultSholarship);
        }
    }
}
