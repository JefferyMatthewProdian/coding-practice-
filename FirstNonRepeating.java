import java.util.*;
public class FirstNonRepeating {
    public static void main(String[] args) {
        int arr [] = {4, 5, 1, 2, 1, 4};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                System.out.println(arr[i]);
                break;
            }
        }

    }
}