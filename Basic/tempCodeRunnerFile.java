import java.util.Scanner;
public class isDivisibleBy9 {

    public static boolean isDivisibleBy9(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            sum += digit;
        }

        return sum % 9 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(isDivisibleBy9(s));

        sc.close();
    }
}