import java.util.Scanner;

public class p11_USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double usd = Double.parseDouble(scanner.nextLine());
        double usdtobgn = 1.79549;

        double bgn = usd * usdtobgn;

        System.out.printf("%.2f BGN", bgn);

    }
}
