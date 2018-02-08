import java.util.Scanner;

public class p14_TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalHours = hours * 60 + minutes + 15;
        int leftHours = totalHours / 60;
        int leftMinutes = totalHours % 60;

        if (leftHours == 24) {
            leftHours = 0;
        }
        if (leftMinutes <= 9) {
            System.out.printf("%d:0%d", leftHours, leftMinutes);
        } else {
            System.out.printf("%d:%d", leftHours, leftMinutes);
        }
    }
}
