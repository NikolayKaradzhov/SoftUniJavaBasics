import java.util.Scanner;
public class Illidan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPeopleInGroup = Integer.parseInt(scanner.nextLine());
        int oneManPower = Integer.parseInt(scanner.nextLine());
        int illidanHP = Integer.parseInt(scanner.nextLine());

        int allPlayersTotalPower = totalPeopleInGroup * oneManPower;
        int result = allPlayersTotalPower - illidanHP;

        if (allPlayersTotalPower >= illidanHP) {
            System.out.printf("Illidan has been slain! You defeated him with %d points.", result);
        } else {
            System.out.printf("You are not prepared! You need %d more points.", Math.abs(result));
        }

    }
}
