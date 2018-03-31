import java.util.Scanner;

public class LetterCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstLetter = scanner.nextLine().charAt(0);
        char lastLetter = scanner.nextLine().charAt(0);
        char doNotIncludeLetter = scanner.nextLine().charAt(0);
        int comboCount = 0;



        for (char i = firstLetter; i <= lastLetter; i++) {

            for (char j = firstLetter; j <= lastLetter; j++) {

                for (char k = firstLetter; k <= lastLetter; k++) {
                    String generatedString = "" + i + j + k;
                    if (generatedString.contains("" + doNotIncludeLetter)) {
                        continue;
                    }
                    comboCount++;
                    System.out.print(generatedString + " ");
                }
            }
        }
        System.out.println(comboCount);
    }
}
