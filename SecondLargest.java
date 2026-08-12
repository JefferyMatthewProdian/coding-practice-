
import java.util.*;

public class SecondLargest{
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15, 20};
        int max = Integer.MIN_VALUE;
        int secondMax =  Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        System.out.println("This is max "+max+"  This is second max "+secondMax);
    }
}


//attempt 1
//public class SecondLargest{
//    public static void main(String[] args){
//        int [] arr = {10,5,8,20,15,20};
//        int max = Arrays.stream(arr).max().getAsInt();
//        int secondMax = 0;
//        for (int i:arr){
//            if(secondMax<i && i!=max){
//                secondMax = i;
//            }
//        }
//        System.out.println(secondMax);
//    }
//}