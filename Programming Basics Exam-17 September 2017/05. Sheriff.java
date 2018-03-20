import java.util.Scanner;

public class Sherrif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int width = 3 * n;
        int dot = (((3 * n)) - (2 * n + 1)) / 2;
        int x = n;
        int middleX = width / 2;
        int dotDownPart = (((3 * n)) - (2 * n + 1)) / 2;
        int xDownPart = n;
        int middleXnew = width / 2;

        //firstRow
        System.out.println(draw(".", width / 2 )
                + "x" + draw(".", width / 2));

        //secondRow
        System.out.println(draw(".", width / 2 - 1)
                + "/" + "x" + "\\" + draw(".", width / 2 - 1));

        //thirdRow
        System.out.println(draw(".", width / 2 - 1)
                + "x" + "|" + "x" + draw(".", width / 2 - 1));
        
        //firstBeforeMiddlePart 
        for (int i = 0; i < n / 2; i++) {
            System.out.println(draw(".", dot)
                    + draw("x", x)
                    + "|"
                    + draw("x", x)
                    + draw(".",dot));
            x++;
            dot--;
        }
        //secondBeforeMiddlePart
        for (int i = 0; i < n / 2 + 1 ; i++) {
            System.out.println(draw(".", i)
                    + draw("x", middleX)
                    + "|"
                    + draw("x", middleX)
                    + draw(".", i));
            middleX--;
        }

        //MiddlePart
        System.out.println(draw(".", width / 2 - 1)
                + "/" + "x" + "\\"
                + draw(".", width / 2 - 1));
        System.out.println(draw(".", width / 2 - 1)
                + "\\" + "x" + "/"
                + draw(".", width / 2 - 1));

        for (int i = 0; i < n / 2; i++) {
            System.out.println(draw(".", dotDownPart)
                    + draw("x", xDownPart)
                    + "|"
                    + draw("x", xDownPart)
                    + draw(".",dotDownPart));
            xDownPart++;
            dotDownPart--;
        }

        for (int i = 0; i < n / 2 + 1 ; i++) {
            System.out.println(draw(".", i)
                    + draw("x", middleXnew)
                    + "|"
                    + draw("x", middleXnew)
                    + draw(".", i));
            middleXnew--;
        }

        System.out.println(draw(".", width / 2 - 1)
                + "x" + "|" + "x" + draw(".", width / 2 - 1));

        System.out.println(draw(".", width / 2 - 1)
                + "\\" + "x" + "/" + draw(".", width / 2 - 1));

        System.out.println(draw(".", width / 2 )
                + "x" + draw(".", width / 2));

    }
    private static String draw(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
