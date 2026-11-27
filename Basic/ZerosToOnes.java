
public class ZerosToOnes {
    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int last = n % 10;
            if (last == 0) {
                last++;
                rev = rev * 10 + last;
            } else {
                rev = rev * 10 + last;
            }
            n /= 10;
        }
        return rev;
    }

    public static int replaceZerosWithOnes(int n) {
        int rev = reverse(n);
        int ans = reverse(rev);
        return ans;
    }

    public static void main(String args[]) {
        int n = 1020;
        int ans = replaceZerosWithOnes(n);
        System.out.println(ans);
    }
}
