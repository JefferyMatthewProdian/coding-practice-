import java.lang.*;
import java.util.*;
public class BuyAndSellStock {
    public static void main(String[] args) {
        int [] arr = {2, 4, 1};
        int profit = 0;
        int local_profit = 0;
        int var_1 = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>var_1){
                local_profit=arr[i]-var_1;
                profit=Math.max(local_profit,profit);
            }
            else{
                var_1=arr[i];
            }
        }
        System.out.println(profit);
    }
}