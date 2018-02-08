import java.util.Scanner;

public class p08_TradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sellVolume = Double.parseDouble(scanner.nextLine());

        if ("Sofia".equals(town)) {
            if (sellVolume > 0 && sellVolume <= 500) {
                System.out.println(sellVolume * 5 / 100);
            } else if (sellVolume > 500 && sellVolume <= 1000) {
                System.out.println(sellVolume * 7 / 100);
            } else if (sellVolume > 1000 && sellVolume < 10000) {
                System.out.println(sellVolume * 8 / 100);
            } else if (sellVolume >= 10000) {
                System.out.println(sellVolume * 12 / 100);
            } else {
                System.out.println("error");
            }

        } else if ("Varna".equals(town)) {
            if (sellVolume > 0 && sellVolume <= 500) {
                System.out.println(sellVolume * 4.5 / 100);
            } else if (sellVolume >= 500 && sellVolume <= 1000) {
                System.out.println(sellVolume * 7.5 / 100);
            } else if (sellVolume > 1000 && sellVolume < 10000) {
                System.out.println(sellVolume * 10 / 100);
            } else if (sellVolume >= 10000) {
                System.out.println(sellVolume * 13 / 100);
            } else {
                System.out.println("error");
            }
        } else if ("Plovdiv".equals(town)) {
            if (sellVolume > 0 && sellVolume <= 500) {
                System.out.println(sellVolume * 5.5 / 100);
            } else if (sellVolume > 500 && sellVolume <= 1000) {
                System.out.println(sellVolume * 8 / 100);
            } else if (sellVolume > 1000 && sellVolume < 10000) {
                System.out.println(sellVolume * 12 / 100);
            } else if (sellVolume >= 10000) {
                System.out.println(sellVolume * 14.5 / 100);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }

    }
}
