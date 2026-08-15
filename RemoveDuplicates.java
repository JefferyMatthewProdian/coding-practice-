import java.util.*;

public class RemoveDuplicates{
    public static void main(String[] args) {
        int i = 1 ;
        int [] arr = {1,1,2,2,3,4,5,5,7};
        for(int j=1;j<arr.length;j++){
            if(arr[j-1]!=arr[j]){
                arr[i]=arr[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}