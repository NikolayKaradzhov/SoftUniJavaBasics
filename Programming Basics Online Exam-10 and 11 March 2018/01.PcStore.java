import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double processorPrice = Double.parseDouble(scanner.nextLine());
        double videoCardPrice = Double.parseDouble(scanner.nextLine());
        double ramPrice = Double.parseDouble(scanner.nextLine());
        double ramCount = Double.parseDouble(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double processorPriceInLeva = processorPrice * 1.57;
        double videoCardPriceInLeva = videoCardPrice * 1.57;
        double ramPriceInLeva = (ramPrice * ramCount) * 1.57;

        double priceProcessorWithDiscount = processorPriceInLeva - (processorPriceInLeva * discount);
        double priceVideoCardWithDiscount = videoCardPriceInLeva - ( videoCardPriceInLeva * discount);

        double result = priceProcessorWithDiscount + priceVideoCardWithDiscount + ramPriceInLeva;

        System.out.printf("Money needed - %.2f leva.", result);

    }
}
