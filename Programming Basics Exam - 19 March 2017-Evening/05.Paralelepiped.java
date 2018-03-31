import java.util.Scanner;

public class Paralelepiped {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int outerPoints = n * 2;
        int innerPoints = n * 2;

        //FirstLine
        System.out.println("+" + draw("~", n - 2)
                + "+" + draw(".", n * 2 + 1));
        
        //FirstMiddlePart
        for (int i = 0; i < n * 2 + 1; i++) {
            System.out.println("|" + draw(".", i)
                    + "\\"
                    + draw("~", n - 2 )
                    + "\\"
                    + draw(".", outerPoints));
            outerPoints--;
        }
        
        //SecondMiddlePart
        for (int i = 0; i < n * 2 + 1; i++) {
            System.out.println(draw(".", i)
                    + "\\"
                    + draw(".", innerPoints )
                    + "|"
                    + draw("~", n - 2)
                    + "|");
            innerPoints--;
        }

        //LastLine
        System.out.println(draw(".", n * 2 + 1)
                + "+"
                + draw("~", n - 2)
                + "+");

    }
    private static String draw(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
