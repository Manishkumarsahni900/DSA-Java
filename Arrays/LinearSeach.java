public class LinearSeach {
    public static void main(String args[]){
        int arr[] = {1,4,2,5,6,9,7,8};
        int target = 9;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("Target is present at index = " + i);
            }
        }
    }
}
