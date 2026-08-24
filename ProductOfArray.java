import java.util.*;
public class ProductOfArray {
    public static void main(String[] args) {
        int arr [] = {9,2,3,4};
        int temp_arr [] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp_arr[i]=arr[i];
        }
        int left = 1;
        for(int i=0;i<arr.length;i++){
            if((i-1)<0){
                left=temp_arr[i];
                temp_arr[i]=1;
            }
            else{
                int temp = temp_arr[i];
                temp_arr[i] = left;
                left*=temp;
            }
        }
        left = 1;
        for(int i=arr.length-1;i>=0;i--){
            if(i+1>arr.length-1){
                left=arr[i];
            }
            else{
                int temp = arr[i];
                temp_arr[i]*=left;
                left*=temp;
            }
        }

        System.out.println(Arrays.toString(temp_arr));
    }
}