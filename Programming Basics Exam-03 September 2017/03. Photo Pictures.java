import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountPictures = Integer.parseInt(scanner.nextLine());
        String sizeOfPictures = scanner.nextLine();
        String deliveryOrOffice = scanner.nextLine();
        double price = 0;
        double discountPrice = 0;
        double result = 0;
        double priceWithOnlineDiscount = 0;

        double price9x13 = 0.16;
        double price10x15 = 0.16;
        double price13x18 = 0.38;
        double price20x30 = 2.90;


        if ("9X13".equals(sizeOfPictures)) {
            if (amountPictures < 50) {
                price = price9x13 * amountPictures;
            } else {
                price = (price9x13 * amountPictures) - (price9x13 * amountPictures) * 5 / 100;
            }
        } else if ("10X15".equals(sizeOfPictures)) {
            if (amountPictures < 80) {
                price = price10x15 * amountPictures;
            } else {
                price = (price10x15 * amountPictures) - (price10x15 * amountPictures) * 3 / 100;
            }
        } else if ("13X18".equals(sizeOfPictures)) {
            if (amountPictures < 50) {
                price = price13x18 * amountPictures;
            } else if (amountPictures >= 50 && amountPictures <= 100) {
                price = (price13x18 * amountPictures) - (price13x18 * amountPictures) * 3 / 100;
            } else {
                price = (price13x18 * amountPictures) - (price13x18 * amountPictures) * 5 / 100;
            }
        } else if ("20X30".equals(sizeOfPictures)) {
            if (amountPictures < 10) {
                price = price20x30 * amountPictures;
            } else if (amountPictures >= 10 && amountPictures <= 50) {
                price = (price20x30 * amountPictures) - (price20x30 * amountPictures) * 7 / 100;
            } else {
                price = (price20x30 * amountPictures) - (price20x30 * amountPictures) * 9 / 100;
            }
        }
        if ("online".equals(deliveryOrOffice)) {
            price = price - (price * 2 / 100);
        }

        
        System.out.printf("%.2fBGN", price);
    }

}
