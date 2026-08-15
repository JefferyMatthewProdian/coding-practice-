import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {2, 11, 7, 15};
        int Two_Sum = 9;
        int [] output = new int[2];
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<arr.length;i++){
            int target = Two_Sum-arr[i];
            if(map.containsKey(target)){
                output[0]=i;
                output[1]=map.get(target);
                break;
            }
            map.put(arr[i],i);
        }
        System.out.println(Arrays.toString(output));
        System.out.println(map);
    }
}