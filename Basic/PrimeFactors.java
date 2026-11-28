import java.util.*;
public class PrimeFactors {
    public static List<List<Integer>> primeFactors(int[] queries) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int num : queries) {
            List<Integer> list = new ArrayList<>();

            for (int i = 2; i <= num; i++) {
                while (num % i == 0) {
                    list.add(i);
                    num /= i;
                }
            }

            ans.add(list);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] queries = {2, 3, 4, 5, 6};

        List<List<Integer>> result = primeFactors(queries);

        System.out.println(result);
    }
}
