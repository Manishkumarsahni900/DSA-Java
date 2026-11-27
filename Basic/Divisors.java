import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Divisors {

    public static int[] divisors(int n) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                ans.add(i);
            }
        }
        int arr[] = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int n = 12;
        int result[] = divisors(n);
        System.out.println(Arrays.toString(result));
    }
}