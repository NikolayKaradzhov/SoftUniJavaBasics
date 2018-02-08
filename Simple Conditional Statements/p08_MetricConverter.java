import java.util.Scanner;

public class p08_MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double toConvert = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();
        String output = scan.nextLine();

        if (input.equals("mm")) {
            toConvert = toConvert / 1000;
        }
        else if (input.equals("cm")) {
            toConvert = toConvert / 100;
        }
        else if (input.equals("mi")) {
            toConvert = toConvert / 0.000621371192;
        }
        else if (input.equals("in")) {
            toConvert = toConvert / 39.3700787;
        }
        else if (input.equals("km")) {
            toConvert = toConvert / 0.001;
        }
        else if (input.equals("ft")) {
            toConvert = toConvert / 3.2808399;
        }
        else if (input.equals("yd")) {
            toConvert = toConvert / 1.0936133;
        }
        if (output.equals("mm")) {
            toConvert = toConvert * 1000;
        }
        else if (output.equals("cm")) {
            toConvert = toConvert * 100;
        }
        else if (output.equals("mi")) {
            toConvert = toConvert * 0.000621371192;
        }
        else if (output.equals("in")) {
            toConvert = toConvert * 39.3700787;
        }
        else if (output.equals("km")) {
            toConvert = toConvert * 0.001;
        }
        else if (output.equals("ft")) {
            toConvert = toConvert * 3.2808399;
        }
        else if (output.equals("yd")) {
            toConvert = toConvert * 1.0936133;
        }
        System.out.printf("%.8f %s", toConvert, output);
        
    }
}
    
