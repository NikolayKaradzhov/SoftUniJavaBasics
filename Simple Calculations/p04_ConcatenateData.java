import java.util.Scanner;

public class p04_ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        // “You are <firstName> <lastName>,a <age>-years old person from <town>
        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);
    }
}
