import java.util.Scanner;

public class Ladybird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        //ladyBird head
        for (int i = 0; i < 1; i++) {
            System.out.println(draw(" ", n - 2) + "@" + draw(" ", 3) + "@");
            System.out.println(draw(" ", n - 1) + "\\" + "_" + "/");
        }
        //ladyBirdHeadContinue
        for (int i = 0; i < 1; i++) {
            System.out.println(draw(" ", n - 1) + "/" + " " + "\\");
            System.out.println(draw(" ", n - 1) + "|" + "_" + "|");
        }
        //ladyBirdBodyFirstPart
        for (int i = 1; i <= n; i++) {
            System.out.println(draw(" ", n - i) + "/"
                    + draw(" ", i - 1)
                    + "|" + draw(" ", i - 1)
                    + "\\");
        }
        //ladyBirdBodyMiddlePart
        for (int i = 0; i < n / 2; i++) {
            if (n % 2 == 0) {
                System.out.println("|" + draw(" ", n / 2 - 1)
                        + "@" + draw(" ", n / 2 - 1)
                        + "|" + draw(" ", n / 2 - 1)
                        + "@" + draw(" ", n / 2 - 1) + "|");
            } else {
                System.out.println("|" + draw(" ", n / 2 - 1)
                        + "@" + draw(" ", n / 2 )
                        + "|" + draw(" ", n / 2 )
                        + "@" + draw(" ", n / 2 - 1 ) + "|");
            }
        }
        //ladyBirdEndMiddlePart
        for (int i = 0; i < n / 2 ; i++) {
            if (n > 2){
                System.out.println(draw(" ", i) + "\\"
                        + draw(" ", n - i - 1)
                        + "|" + draw(" ", n - i - 1) + "/");
            } else {
                System.out.print(draw(" ",n / 2 - 1)
                        + draw(" ", n / 2 - 1));
            }
        }
        //ladyBirdLastPartOfTheBody
        for (int i = 0; i < 1; i++) {
            if (n % 2 == 0) {
                System.out.println(draw(" ", n / 2)
                        + draw("^", n / 2) + "|" + draw("^", n / 2));
            } else {
                System.out.println(draw(" ", n / 2 + 1)
                        + draw("^", n / 2) + "|" + draw("^", n / 2));
            }
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
