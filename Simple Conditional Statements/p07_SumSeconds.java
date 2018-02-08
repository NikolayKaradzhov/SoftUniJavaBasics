import java.util.Scanner;

public class p07_SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int competetor1 = Integer.parseInt(scanner.nextLine());
        int competetor2 = Integer.parseInt(scanner.nextLine());
        int competetor3 = Integer.parseInt(scanner.nextLine());

        int sumSeconds = competetor1 + competetor2 + competetor3;
        int minutes = sumSeconds / 60;
        int seconds = sumSeconds % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d",minutes,seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
