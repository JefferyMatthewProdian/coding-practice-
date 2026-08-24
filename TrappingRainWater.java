import java.util.*;
import java.lang.*;
public class TrappingRainWater {
    public static void main(String[] args) {
        int arr [] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int j = arr.length - 1;
        int i = 0;
        int left = arr[i];
        int right = arr[j];
        int count = 0;

        while (i < j) {
            if (left < right) {
                int temp = Math.min(left, right) - arr[i];
                if (temp > 0) {
                    count += temp;
                }
                i+=1;
                if (arr[i] > left) {
                    left = arr[i];
                }
            } else {
                int temp = Math.min(left, right) - arr[j];
                if (temp > 0) {
                    count += temp;
                }
                j-=1;
                if (arr[j] > right) {
                    right = arr[j];
                }
            }
        }

        System.out.println((count));
    }
}