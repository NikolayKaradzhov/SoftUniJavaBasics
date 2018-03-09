import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double stadiumCapacity = Double.parseDouble(scanner.nextLine());
        double fans = Double.parseDouble(scanner.nextLine());
        double totalA = 0;
        double totalB = 0;
        double totalV = 0;
        double totalG = 0;
        double totalFansCapacity = fans / (stadiumCapacity * 1.0)*100.00;

        for (int i = 0; i < fans; i++) {
            String sectorForEveryFan = scanner.nextLine();
            if ("A".equals(sectorForEveryFan)) {
                totalA++;
            } else if ("B".equals(sectorForEveryFan)) {
                totalB++;
            } else if ("V".equals(sectorForEveryFan)) {
                totalV++;
            } else if ("G".equals(sectorForEveryFan)) {
                totalG++;
            }
        }
        totalA = (totalA / fans) * 100.00;
        totalB = (totalB / fans) * 100.00;
        totalV = (totalV / fans) * 100.00;
        totalG = (totalG / fans) * 100.00;

        System.out.printf("%.2f%%%n",totalA);
        System.out.printf("%.2f%%%n",totalB);
        System.out.printf("%.2f%%%n",totalV);
        System.out.printf("%.2f%%%n",totalG);
        System.out.printf("%.2f%%%n",totalFansCapacity);

    }
}
