public class BinaryToDecimal {
    public static int BinaryToDeci(String s){
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            ans = ans * 2 + (s.charAt(i) - '0');
        }
        return ans;
    }
	public static void main(String[] args) {
		String s = "1011";
		System.out.println(BinaryToDeci(s));
	}
}
