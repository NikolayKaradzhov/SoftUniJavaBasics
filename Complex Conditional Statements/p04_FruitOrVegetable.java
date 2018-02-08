import java.util.Scanner;

public class p04_FruitOrVegetable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String type = input.nextLine();

        if ("banana".equals(type) || "apple".equals(type) || "kiwi".equals(type) || "cherry".equals(type) || "lemon".equals(type)
                || "grapes".equals(type)) {
            System.out.println("fruit");
        } else if ("tomato".equals(type) || "cucumber".equals(type) || "pepper".equals(type) || "carrot".equals(type)) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }

    }
}
