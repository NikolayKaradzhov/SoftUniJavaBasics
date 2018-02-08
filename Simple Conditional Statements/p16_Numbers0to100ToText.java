import java.util.Scanner;
 
public class Numbers0to100ToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, digit1, digit2;
        String str1[] = {"", "", "twenty", "thirty", "forty", "fifty", "sixty",
                "seventy", "eighty", "ninety", "one hundred"};
 
        String str2[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen"};
 
        // String str3[] = {"zero"};
 
        num = scanner.nextInt();
 
        if (num <= -1 || num >= 101) {
            System.out.print("invalid number");
 
        }
        if (num >= 0 && num <= 19) {
            System.out.println(str2[num]);
        } else if (num >= 20 && num <= 100) {
            digit1 = num / 10;
            digit2 = num % 10;
            if (digit2 == 0) {
                System.out.println(str1[digit1]); //+ "" + str2[digit2]);
            } else {
                System.out.println(str1[digit1] + " " + str2[digit2]);
            }
 
        }
    }
}
