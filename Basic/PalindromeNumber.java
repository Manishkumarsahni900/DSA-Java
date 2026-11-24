public class PalindromeNumber {
    public static int isPalindrome(int n){
        int rev = 0;
        while(n > 0){
            int last = n % 10;
            rev = rev * 10 + last;
            n /= 10;
        }
        return rev;
    }
	public static void main(String[] args) {
		int n = 135531;
		int reverse = isPalindrome(n);
		if(n == reverse){
		    System.out.println("Palindrome number");
		}else{
		    System.out.println("not palidrome");
		}
	}
}
