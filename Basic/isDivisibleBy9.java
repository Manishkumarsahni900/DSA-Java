import java.util.Scanner;
public class isDivisibleBy9 {

    public static boolean isDivBy9(String s) {
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
        //s = 96453 = sum = 27 % 9 == 0 true
        System.out.println(isDivBy9(s));

        sc.close();
    }
}