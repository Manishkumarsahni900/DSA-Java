import java.util.*;

public class SumOfTwoPrimeNum {

    public static boolean isSumOfTwoPrimes(int n) {
        Set<Integer> ans = new HashSet<>();

        for (int i = 2; i <= n; i++) {
            boolean prime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                ans.add(i);
            }
        }

        for (int p : ans) {
            int camp = n - p;

            if (ans.contains(camp)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 11;
        // 11 = 2 3 5 7 11 = no two value is equal to 11 
        // 34 = 2 3 5 7 11 13 17 19 23 27 31 = 31 + 3 = 34
        System.out.println(isSumOfTwoPrimes(n));
    }
}