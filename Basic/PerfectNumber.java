public class PerfectNumber {
    public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        return num == sum;
    }
    public static void main(String args[]){
        int n = 29;
        if(checkPerfectNumber(n)){
            System.out.println("perfact number");
        }else{
            System.out.println("Not perfact");
        }
    }
}
