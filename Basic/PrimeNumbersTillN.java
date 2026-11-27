import java.util.ArrayList;
public class PrimeNumbersTillN {

    public static ArrayList<Integer> primeTillN(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
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

        return ans;
    }
    public static void main(String[] args) {
        int n = 20;
        System.out.println(primeTillN(n));
    }
}
