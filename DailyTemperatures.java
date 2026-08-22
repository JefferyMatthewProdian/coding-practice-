import java.util.*;
public class DailyTemperatures {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        int arr [] = {30, 20, 25, 40};
        int daily_temp [] = new int[arr.length];
        for (int i=arr.length-1;i>=0;i--){
            int temp =0;
            while(!stack.isEmpty()){
                if(arr[stack.peek()]>arr[i]) {
                    temp=stack.peek();
                    break;
                }
                stack.pop();
            }
            stack.push(i);
            daily_temp[i]=(temp>0)?temp-i:0;

        }
        System.out.println(Arrays.toString(daily_temp));
    }
}