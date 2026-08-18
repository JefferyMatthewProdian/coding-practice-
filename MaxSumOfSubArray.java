import java.lang.*;
public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int [] arr = {5, 2, -1};
        int k = 3 ;
        int local_max = 0;
        int global_max = 0;
        if(arr.length>=k){
            for(int i=0;i<arr.length;i++){
                if(i<k){
                    local_max+=arr[i];
                    global_max=local_max;
                }
                else {
                    local_max = local_max-arr[i-k]+arr[i];
//                    System.out.println(local_max+" "+arr[i-k]+" "+arr[i]);
                    global_max = Math.max(local_max, global_max);
                }
            }
            System.out.println(global_max);
        }
    }
}