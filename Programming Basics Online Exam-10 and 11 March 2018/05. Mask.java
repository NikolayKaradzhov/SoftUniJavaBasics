import java.util.Scanner;

public class Mask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int specialSymbol = n * 2;

        //TopPartOfTheMask
        for (int i = 0; i < n - 1; i++) {
            System.out.println(draw(" ", n - 2 - i)
                    + "/" + draw(" ", i)
                    + "|" + "  " + "|" + draw(" ", i) + "\\");
        }

        //Line
        System.out.println(draw("-", n * 2 + 2));

        //ForeheadPart
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                System.out.println("|" + draw(" ", n / 2 - 1)
                        + "_" + draw(" ", (n * 2 + 2) - 2 * (n / 2) - 2)
                        + "_" + draw(" ", n / 2 - 1) + "|");
            }
            if (i == 1) {
                System.out.println("|" + draw(" ", n / 2 - 1)
                        + "@" + draw(" ", (n * 2 + 2) - 2 * (n / 2) - 2 )
                        + "@" + draw(" ", n / 2 - 1) + "|");
            }
        }
        //EmptyMiddlePart
        for (int i = 0; i < n / 2; i++) {
            System.out.println("|" + draw(" ", 2 * n) + "|");
        }
        //FaceBottomPart
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println("|" + draw(" ",n - 1)
                        + "OO" + draw(" ", n - 1) + "|");
            }
            if (i == 1) {
                System.out.println("|" + draw(" ", n - 2)
                        + "/" + "  " + "\\" + draw(" ", n - 2) + "|");
            }
            if (i == 2) {
                System.out.println("|" + draw(" ", n - 2)
                        + "||||" + draw(" ", n - 2) + "|");
            }
        }
        //LastPart
        for (int i = 0; i < n + 1; i++) {
            System.out.println(draw("\\", i + 1 )
                    + draw("`", specialSymbol)
                    + draw("/", i + 1));
            specialSymbol -= 2;
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
