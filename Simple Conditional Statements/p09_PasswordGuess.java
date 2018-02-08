import java.util.Scanner;

public class p09_PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputPassword = scanner.nextLine();
        String phrase = "s3cr3t!P@ssw0rd";

        if (inputPassword.equals(phrase)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }


    }
}
