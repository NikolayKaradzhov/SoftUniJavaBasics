import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Scanner;

public class DeerOfSanta16122017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double daysSantaIsMissing = Double.parseDouble(scanner.nextLine());
        double leftFoodInKilos = Double.parseDouble(scanner.nextLine());
        double foodPerDayFor1 = Double.parseDouble(scanner.nextLine());
        double foodPerDayFor2 = Double.parseDouble(scanner.nextLine());
        double foodPerDayFor3 = Double.parseDouble(scanner.nextLine());

        double needFoodFor1 = daysSantaIsMissing * foodPerDayFor1;
        double needFoodFor2 = daysSantaIsMissing * foodPerDayFor2;
        double needFoodFor3 = daysSantaIsMissing * foodPerDayFor3;

        double totalFoodForAll = needFoodFor1 + needFoodFor2 + needFoodFor3;
        double ostavashtaHrana = Math.abs(totalFoodForAll - leftFoodInKilos);

        if (totalFoodForAll < leftFoodInKilos) {
            System.out.printf("%.0f kilos of food left.", Math.floor(ostavashtaHrana));
        } else {
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(ostavashtaHrana));
        }
    }
}
