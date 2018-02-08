import java.util.Scanner;

public class p03_EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        boolean even = (num % 2 == 0);

        if (even){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}
