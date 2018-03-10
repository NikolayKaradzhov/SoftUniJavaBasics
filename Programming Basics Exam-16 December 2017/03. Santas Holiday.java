import java.util.Scanner;

public class SantasHoliday16122017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double daysHoliday = Double.parseDouble(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String feedback = scanner.nextLine();

        double nightsStay = daysHoliday - 1;
        double discount = 0.0;
        double pricePerNight = 0.0;
        double priceForStayAllPeriod = 0.0;
        double totalSum = 0.0;
        double totalSumWithAddition = 0.0;

        if ("room for one person".equalsIgnoreCase(typeRoom)){
            if (daysHoliday < 10) {
                discount = 0.0;
                pricePerNight = 18.00;
                priceForStayAllPeriod = nightsStay * pricePerNight;
                totalSum = priceForStayAllPeriod;
            } else if (daysHoliday >= 10 && daysHoliday <= 15) {
                discount = 0.0;
                pricePerNight = 18.00;
                priceForStayAllPeriod = nightsStay * pricePerNight;
                totalSum = priceForStayAllPeriod;
            } else if (daysHoliday > 15) {
                discount = 0.0;
                pricePerNight = 18.00;
                priceForStayAllPeriod = nightsStay * pricePerNight;
                totalSum = priceForStayAllPeriod;
            }

        } else if ("apartment".equalsIgnoreCase(typeRoom)) {
            if (daysHoliday < 10) {
                discount = 0.3;
                pricePerNight = 25.00;
                priceForStayAllPeriod = nightsStay * pricePerNight;
                totalSum = priceForStayAllPeriod - (priceForStayAllPeriod * discount);
            } else if (daysHoliday >= 10 && daysHoliday <= 15) {
                discount = 0.35;
                pricePerNight = 25.00;
                priceForStayAllPeriod = nightsStay * pricePerNight;
                totalSum = priceForStayAllPeriod - (priceForStayAllPeriod * discount);
            } else if (daysHoliday > 15) {
                discount = 0.50;
                pricePerNight = 25.00;
                priceForStayAllPeriod = nightsStay * pricePerNight;
                totalSum = priceForStayAllPeriod - (priceForStayAllPeriod * discount);
            }

        } else if ("president apartment".equalsIgnoreCase(typeRoom)) {
            if (daysHoliday < 10) {
                discount = 0.10;
                pricePerNight = 35.00;
                priceForStayAllPeriod = nightsStay * pricePerNight;
                totalSum = priceForStayAllPeriod - (priceForStayAllPeriod * discount);
            } else if (daysHoliday >= 10 && daysHoliday <= 15) {
                discount = 0.15;
                pricePerNight = 35.00;
                priceForStayAllPeriod = nightsStay * pricePerNight;
                totalSum = priceForStayAllPeriod - (priceForStayAllPeriod * discount);
            } else if (daysHoliday > 15) {
                discount = 0.20;
                pricePerNight = 35.00;
                priceForStayAllPeriod = nightsStay * pricePerNight;
                totalSum = priceForStayAllPeriod - (priceForStayAllPeriod * discount);
            }
        }
        if ("positive".equalsIgnoreCase(feedback)) {
            totalSumWithAddition = totalSum + (0.25 * totalSum);
        }else if ("negative".equalsIgnoreCase(feedback)) {
            totalSumWithAddition = totalSum - (0.1 * totalSum);
        }
        System.out.printf("%.2f", totalSumWithAddition);
    }
}
