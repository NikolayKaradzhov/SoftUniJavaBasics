import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class p13_1000DaysAfterBirth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String inDate = scanner.nextLine();
        LocalDate locD = LocalDate.parse(inDate, formatter);
        LocalDate plus999Days = locD.plusDays(999);

        System.out.println(plus999Days.format(formatter));
    }
}
