import java.util.Scanner;

public class p11_Cinema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String typeOfProjection = input.nextLine();
        int rows = Integer.parseInt(input.nextLine());
        int cows = Integer.parseInt(input.nextLine());

        double ticketPremiere = 12.00;
        double ticketNormal = 7.50;
        double ticketDiscount = 5.00;

        int result = rows * cows;

        switch (typeOfProjection) {
            case "Premiere" :
                System.out.printf("%.2f%nleva", result * ticketPremiere); break;
            case "Normal" :
                System.out.printf("%.2f%nleva", result * ticketNormal); break;
            case "Discount" :
                System.out.printf("%.2f%nleva", result * ticketDiscount); break;
        }



    }
}
