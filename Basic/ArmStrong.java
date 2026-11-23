public class ArmStrong
{
    public static int count(int a){
        int count = 0;
        while(a > 0){
            count++;
            a /= 10;
        }
        return count;
    }
    public static int multiplication(int cD, int a){
        int sum = 0;
        while(a > 0){
            int last = a % 10;
            int power = 1;
            for(int i = 1; i <= cD; i++){
                power *= last;
            }
            sum += power;
            a /= 10;
        }
        return sum;
    }
	public static void main(String[] args) {
		int a = 153;
		int countDigit = count(a);
		int mult = multiplication(countDigit, a);
		System.out.println(a == mult);
	}
}