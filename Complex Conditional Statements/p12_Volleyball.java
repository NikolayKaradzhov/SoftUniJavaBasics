import java.util.Scanner;

public class p12_Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int holidaysInYear = Integer.parseInt(scanner.nextLine());
        int weekendsVladiIsInHomeTown = Integer.parseInt(scanner.nextLine());

        double weekendsInYear = -1;
        double weekendsInSofia = -1;
        double saturdayGamesInSofia = -1;

        double gamesInSofiaDuringHoliday = -1;
        double total = -1;
        double totalPlus15 = -1;
        double result = -1;

        if ("leap".equals(year)) {
            weekendsInYear = 48;
            weekendsInSofia = weekendsInYear - weekendsVladiIsInHomeTown;
            saturdayGamesInSofia = weekendsInSofia * 3.0 / 4;
            gamesInSofiaDuringHoliday = holidaysInYear * 2.0 / 3;
            total = saturdayGamesInSofia + gamesInSofiaDuringHoliday + weekendsVladiIsInHomeTown;
            totalPlus15 = total * 15 / 100;
            result = total + totalPlus15;
            System.out.println (Math.floor(result));

        } else if ("normal".equals(year)) {
            weekendsInYear = 48;
            weekendsInSofia = weekendsInYear - weekendsVladiIsInHomeTown;
            saturdayGamesInSofia = weekendsInSofia * 3.0 / 4;
            gamesInSofiaDuringHoliday = holidaysInYear * 2.0 / 3;
            total = saturdayGamesInSofia + gamesInSofiaDuringHoliday + weekendsVladiIsInHomeTown;
            System.out.println(Math.floor(total));
        }
    }
}
