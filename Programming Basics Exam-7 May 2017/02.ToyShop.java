import java.util.Scanner;

public class ToyShop07May2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double holidayPrice = Double.parseDouble(scanner.nextLine());
        double puzzleCount = Double.parseDouble(scanner.nextLine());
        double talkingDollsCount = Double.parseDouble(scanner.nextLine());
        double teddyBearsCount = Double.parseDouble(scanner.nextLine());
        double minionsCount = Double.parseDouble(scanner.nextLine());
        double trucksCount = Double.parseDouble(scanner.nextLine());

        double puzzlePrice = 2.60;
        double talkingDollPrice = 3.00;
        double teddyBearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2.00;

        double totalSumWithoutOtherPayments = (puzzleCount * puzzlePrice)
                + (talkingDollsCount * talkingDollPrice)
                + (teddyBearsCount * teddyBearPrice)
                + (minionsCount * minionPrice)
                + (trucksCount * truckPrice);

        double totalNumberOfToys = puzzleCount + talkingDollsCount + teddyBearsCount + minionsCount + trucksCount;

        double totalDiscountPrice = totalSumWithoutOtherPayments - (0.25 * totalSumWithoutOtherPayments);
        double endMoneyAfterRent = totalDiscountPrice - (0.1 * totalDiscountPrice);
        double endMoneyAfterRentWithou25Discount = totalSumWithoutOtherPayments - (0.1 * totalSumWithoutOtherPayments);
        double finalMoneyLeftWithDiscount = endMoneyAfterRent - holidayPrice;
        double finalMoneyNeedWithDiscount = holidayPrice - endMoneyAfterRent;
        double finalMoneyLeftWithoutDiscount = totalSumWithoutOtherPayments - (0.1 * totalSumWithoutOtherPayments);
        double finalMoneyNeedWithoutDiscount = holidayPrice - endMoneyAfterRentWithou25Discount;

        if (totalNumberOfToys >= 50) {
            if  (endMoneyAfterRent >= holidayPrice) {
                System.out.printf("Yes! %.2f lv left.",finalMoneyLeftWithDiscount);
            } else {
                System.out.printf("Not enough money! %.2f lv needed.", finalMoneyNeedWithDiscount);
            }
        }else {
            if (endMoneyAfterRentWithou25Discount <= holidayPrice) {
                System.out.printf("Not enough money! %.2f lv needed.", finalMoneyNeedWithoutDiscount);
            } else {
                System.out.printf("Yes! {оставащите пари} lv left.", finalMoneyLeftWithoutDiscount);
            }
        }
    }
}
