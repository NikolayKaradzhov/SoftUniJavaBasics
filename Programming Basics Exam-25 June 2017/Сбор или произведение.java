import java.util.Scanner;

public class SborIliProizvedenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlNumber = Integer.parseInt(scanner.nextLine());
        int flag = 0;

        for (int a = 1; a <= 30; a++) {
            for (int b = 1; b <= 30; b++) {
                for (int c = 1; c <= 30; c++) {
                    if (((a < b) && (b < c) && controlNumber == a + b + c)) {
                        System.out.println(a + " + " + b + " + " + c + " = " + controlNumber);
                        flag = 1;
                    }
                    if (((a > b) && (b > c) && controlNumber == a * b * c)) {
                        System.out.println(a + " * " + b + " * " + c + " = " + controlNumber);
                        flag = 1;
                    }
                }
            }
        }
        if (flag == 0) {
            System.out.println("No!");
        }
    }
}
