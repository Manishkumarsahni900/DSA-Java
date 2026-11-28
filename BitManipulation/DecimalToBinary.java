public class DecimalToBinary {
	public static String DTB(int n){
        String ans = "";

        while(n > 0){
            int rem = n % 2;
            ans += rem;
            n /= 2;
        }
        return ans;
    }
	public static void main(String[] args) {
		int n = 15;
		System.out.println(DTB(n));
	}
}
