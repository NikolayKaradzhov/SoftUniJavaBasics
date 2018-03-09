import java.util.Scanner;

public class Snowflake_03092017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int middleDotsTop = n;

        //TopPartOfTheSnowFlake
        for (int i = 0; i < n - 1; i++) {
            System.out.println(draw(".", i)
                    + "*" + draw(".", middleDotsTop)
                    + "*" + draw(".", middleDotsTop)
                    + "*" + draw(".", i));
            middleDotsTop--;
        }

        //BeforeMiddleRow
        System.out.println(draw(".", n - 1)
                + draw("*", 5)
                + draw(".", n - 1));

        //Middle
        System.out.println(draw("*", 2 * n + 3));

        //AfterTheMiddle
        System.out.println(draw(".", n - 1)
                + draw("*", 5)
                + draw(".", n - 1));

        //BottomPartOfTheSnowflake
        for (int i = n - 1; i > 0; i--) {
            System.out.println(draw(".", i -1)
                    + "*" + draw(".", middleDotsTop  + 1)
                    + "*" + draw(".", middleDotsTop + 1 )
                    + "*" + draw(".", i - 1));
            middleDotsTop++;
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
