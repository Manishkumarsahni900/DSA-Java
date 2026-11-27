public class LCMOfTwoNumber {
    public static int LCM(int n1, int n2) {
        int a = n1, b = n2;

        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }

        return (n1 * n2) / a;
    }

    public static void main(String[] args) {

        int n1 = 12;
        int n2 = 18;

        System.out.println(LCM(n1, n2));
    }
}