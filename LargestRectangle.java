import java.util.*;
import java.lang.*;
public class LargestRectangle {
    public static void main(String[] args) {
        int[] arr = {5,5,5, 5};
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        stack.push(0);
        int local = 0;
        int global = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[stack.peek()]){
                while(!stack.isEmpty() && ( arr[stack.peek()] > arr[i] )){
//                    System.out.println(stack+" "+arr[stack.peek()]+" "+arr[i]);
                    local = Math.max(local, arr[stack.peek()]*(i-stack.peek()));
                    stack.pop();
                }
            }
            stack.push(i);
            global = Math.max(global,local);
        }
        while(!stack.isEmpty()){
            if(stack.size() ==  1){
                global = Math.max(global, arr.length*arr[stack.peek()]);
            }
            else {
                global = Math.max(global, (arr.length-stack.peek())*arr[stack.peek()]);
            }
            stack.pop();
        }
        System.out.println(global);
    }
}