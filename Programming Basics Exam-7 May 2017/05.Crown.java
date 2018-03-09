import java.util.Scanner;

public class Crown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sideDots = 1;
        int middleDots = 1;
        int spaces = n - 5;

        //FirstRow
        System.out.println("@" + draw(" ", n - 2) + "@" + draw(" ", n - 2) + "@");

        //SecondRow
        System.out.println("**" + draw(" ",n - 3) + "*" + draw(" ", n - 3) + "**");

        //ThirdPart
        for (int i = 0; i < ((n - 2)/2) - 1; i++) {
            System.out.println("*" + draw(".", sideDots)
                    + "*" + draw(" ", spaces)
                    + "*" + draw(".", middleDots)
                    + "*" + draw(" ",spaces)
                    + "*" + draw(".", sideDots)
                    + "*");
            sideDots++;
            middleDots +=2;
            spaces -=2;
        }

        //FourthPart
        System.out.println("*" + draw(".", (n - 2) / 2)
                + "*" + draw(".", n - 3)
                + "*" + draw(".", (n - 2) / 2)
                + "*");

        //FifthPart
        System.out.println("*" + draw(".", n / 2)
                + draw("*", (n / 2)- 2)
                + "." + draw("*", (n / 2) - 2)
                + draw(".", n / 2) + "*");

        //SixthLastPartWithAsteriks
        for (int i = 1; i < 3; i++) {
            System.out.println(draw("*",2 * n - 1));
        }
    }

    private static String draw(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
