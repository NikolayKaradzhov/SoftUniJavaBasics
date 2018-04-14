import java.util.Scanner;

public class Group_Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstLetter = scanner.nextLine().charAt(0);
        char secondLetter = scanner.nextLine().charAt(0);
        char thirdLetter = scanner.nextLine().charAt(0);
        char fourthLetter = scanner.nextLine().charAt(0);
        int num = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (char i = 'A'; i <= firstLetter; i++) {
            for (char j = 'a'; j <= secondLetter; j++) {
                for (char k = 'a'; k <= thirdLetter; k++) {
                    for (char m = 'a'; m <= fourthLetter; m++) {
                        for (int n = 0; n <= num; n++) {
                            if (i == firstLetter && j == secondLetter
                                    && k == thirdLetter && m == fourthLetter && n == num) {
                                break;
                            }
                            counter++;
                        }
                    }
                }
            }
        }
        System.out.println(counter);

    }
}
