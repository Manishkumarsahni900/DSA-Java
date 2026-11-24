public class HarshadNumber {
    public static void main(String args[]){
        int x = 89;
        int sum = 0;
        int n = x;
        while(n > 0){
            int last = n % 10;
            sum += last;
            n /= 10;
        }
        if(x % sum == 0){
            System.out.println(sum);
        }else{
            System.out.println(-1);
        }
    }
}
