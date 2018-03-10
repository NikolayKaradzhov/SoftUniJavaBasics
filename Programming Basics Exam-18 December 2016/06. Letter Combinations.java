import java.util.Scanner;

public class nod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstLetter = scanner.nextLine().charAt(0);
        char lastLetter = scanner.nextLine().charAt(0);
        char doNotIncludeLetter = scanner.nextLine().charAt(0);
        int comboCount = 0;


        for (char i = firstLetter; i <= lastLetter; i++) {

            for (char j = firstLetter; j <= lastLetter; j++) {

                for (char k = firstLetter; k <= lastLetter; k++) {
                    if (k == doNotIncludeLetter || i == doNotIncludeLetter || j == doNotIncludeLetter) {
                        continue;
                    }
                    comboCount++;
                    System.out.printf("%c%c%c ", i, j, k);
                }
            }
        }
        System.out.println(comboCount);
    }
}


