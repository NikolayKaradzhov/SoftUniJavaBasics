import java.util.Scanner;

public class p02_SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if ("coffee".equals(product)) {
            if ("Sofia".equals(town)) {
                System.out.println(0.50 * quantity);
            } else if ("Plovdiv".equals(town)) {
                System.out.println(0.40 * quantity);
            } else if ("Varna".equals(town)) {
                System.out.println(0.45 * quantity);
            }
        } if ("water".equals(product)) {
            if ("Sofia".equals(town)) {
                System.out.println(0.80 * quantity);
            } else if ("Plovdiv".equals(town)) {
                System.out.println(0.70 * quantity);
            } else if ("Varna".equals(town)) {
                System.out.println(0.70 * quantity);
            }
        } if ("beer".equals(product)) {
            if ("Sofia".equals(town)) {
                System.out.println(1.20 * quantity);
            } else if ("Plovdiv".equals(town)) {
                System.out.println(1.15 * quantity);
            } else if ("Varna".equals(town)) {
                System.out.println(1.10 * quantity);
            }
        } if ("sweets".equals(product)) {
            if ("Sofia".equals(town)) {
                System.out.println(1.45 * quantity);
            } else if ("Plovdiv".equals(town)) {
                System.out.println(1.30 * quantity);
            } else if ("Varna".equals(town)) {
                System.out.println(1.35 * quantity);
            }
        } if ("peanuts".equals(product)) {
            if ("Sofia".equals(town)) {
                System.out.println(1.60 * quantity);
            } else if ("Plovdiv".equals(town)) {
                System.out.println(1.50 * quantity);
            } else if ("Varna".equals(town)) {
                System.out.println(1.55 * quantity);
            }
        }

    }
}
