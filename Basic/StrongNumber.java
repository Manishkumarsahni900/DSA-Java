public class StrongNumber {
    public static int calfact(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    public static int digit(int n){
        int fact = 0;
        while(n > 0){
            int last = n % 10;
            fact += calfact(last);
            n /= 10;
        }
        return fact;
    }
	public static void main(String[] args) {
		int n = 8;
		int factSum = digit(n);
		if(n == factSum){
		    System.out.println("Strong number");
		}else{
		    System.out.println("not strong");
		}
	}
}
