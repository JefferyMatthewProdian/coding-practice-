import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int arr_sum = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            arr_sum+=arr[i];
            sum+=i;
        }
        sum+=arr.length;
//        System.out.println(arr_sum);
//        System.out.println(sum);
        System.out.println(sum-arr_sum);
    }
}


//with formula
//int arrSum = 0;
//
//for (int num : arr) {
//arrSum += num;
//}
//
//int expectedSum = arr.length * (arr.length + 1) / 2;
//
//System.out.println(expectedSum - arrSum);