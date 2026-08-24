import java.util.*;
import java.lang.*;
public class TrappingRainWater {
    public static void main(String[] args) {
        int arr [] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int left_tall = arr[0];
        int right_tall = 0;
        int count = 0;
        for (int i=1;i<arr.length;i++){
            int j=arr.length-1;
            while(i<j){
                if(right_tall<arr[j]){
                    right_tall =arr[j];
                }
                j-=1;
            }
            if(arr[i]<Math.min(left_tall,right_tall)){
                System.out.println("Iteration"+i+" "+ (Math.max(left_tall,right_tall)-arr[i]));
                count+=Math.max(left_tall,right_tall)-arr[i];
            }
            if(left_tall<arr[i]){
                left_tall=arr[i];
            }
            System.out.println("left tall "+left_tall+" right tall "+right_tall);
        }
        System.out.println(count);
    }
}