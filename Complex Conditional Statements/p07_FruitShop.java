import java.util.Scanner;

public class p07_FruitShop {
    
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String fruit = scan.nextLine().toLowerCase();
            String day = scan.nextLine().toLowerCase();
            double quantity = Double.parseDouble(scan.nextLine());
            double price = 0.0;

            if (day.equals("monday")
                    || day.equals("tuesday")
                    || day.equals("wednesday")
                    || day.equals("thursday")
                    || day.equals("friday")) {
                if (fruit.equals("banana")) {
                    price = 2.50;
                } else if (fruit.equals("apple")) {
                    price = 1.2;
                } else if (fruit.equals("orange")) {
                    price = 0.85;
                } else if (fruit.equals("grapefruit")) {
                    price = 1.45;
                } else if (fruit.equals("kiwi")) {
                    price = 2.70;
                } else if (fruit.equals("pineapple")) {
                    price = 5.50;
                } else if (fruit.equals("grapes")) {
                    price = 3.85;
                }
            } else if (day.equals("saturday")
                    || day.equals("sunday"))
                if (fruit.equals("banana")) {
                    price = 2.70;
                } else if (fruit.equals("apple")) {
                    price = 1.25;
                } else if (fruit.equals("orange")) {
                    price = 0.90;
                } else if (fruit.equals("grapefruit")) {
                    price = 1.60;
                } else if (fruit.equals("kiwi")) {
                    price = 3;
                } else if (fruit.equals("pineapple")) {
                    price = 5.60;
                } else if (fruit.equals("grapes")) {
                    price = 4.20;
                } else {
                    System.out.println("error");
                }
            double sum = quantity * price;
            if (sum == 0 && quantity != 0) {
                System.out.println("error");
            } else {
                System.out.printf("%.2f", sum);
            }
        }
    }

    
