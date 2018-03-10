import java.util.Scanner;

public class Cup23072017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        //TopRowsOfTheCup
        for (int i = 0; i < n / 2; i++) {
            System.out.println(draw(".", n + i)
                    + draw("#", n * 3 - i * 2)
                    + draw(".", n + i));
        }
        //GurloNaCupata
        for (int i = 0; i < n / 2 + 1; i++) {
            System.out.println(draw(".", ((n * 3) / 2) + i)
                    + "#" + draw(".", ((n * 2) - 2 * i - 2))
                    + "#" + draw(".", ((n * 3) / 2) + i));
        }
        //AloneRow
        System.out.println(draw(".", n * 2)
                + draw("#", n)
                + draw(".", n * 2));

        //BeforeBottomRow
        for (int i = 0; i < n / 2; i++) {
            System.out.println(draw(".", n * 2 - 2)
                    + draw("#", n + 4)
                    + draw(".", n * 2 - 2));
        }

        //DanceRow
        System.out.println(draw(".", (5 * n - 10) / 2)
                + "D^A^N^C^E^" + draw(".", (5 * n - 10) / 2));

        //LastRows
        for (int i = 0; i < n / 2 + 1; i++) {
            System.out.println(draw(".", n * 2 - 2)
                    + draw("#", n + 4)
                    + draw(".", n * 2 - 2));
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
