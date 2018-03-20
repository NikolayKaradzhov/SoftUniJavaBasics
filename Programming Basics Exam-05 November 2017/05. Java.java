import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int width = 3 * n + 6;
        int height = 3 * n + 1;
        int monkeySign = n * 2 + 4;

        for (int i = 0; i < n; i++) {
            System.out.println(draw(" ", n) + "~ ~ ~");
        }
        //======ROW
        System.out.println(draw("=", 3 * n + 5));

        //handleROw
        for (int i = 0; i < n / 2 - 1; i++) {
            System.out.println("|" + draw("~", n * 2 + 4)
                    + "|" + draw(" ", n - 1) + "|");
        }
        //JavaROw
        System.out.println("|" + draw("~", n)
                + "JAVA" + draw("~", n)
                + "|" + draw(" ", n - 1) + "|");

        //UnderJavaROws
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2 - 2 ; i++) {
                System.out.println("|" + draw("~", n * 2 + 4)
                        + "|" + draw(" ", n - 1) + "|");
            }
        } else {
            for (int i = 0; i < n / 2 - 1; i++) {
                System.out.println("|" + draw("~", n * 2 + 4)
                        + "|" + draw(" ", n - 1) + "|");
            }
        }
        //======ROW
        System.out.println(draw("=", 3 * n + 5));
        
        //BeforeLastROw
        for (int i = 0; i < n; i++) {
            System.out.println(draw(" ", i)
                    + "\\" + draw("@",monkeySign)
                    + "/");
            monkeySign -= 2;
        }

        //LastROw
        System.out.println(draw("=", n * 2 + 6));
    }

    private static String draw(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
