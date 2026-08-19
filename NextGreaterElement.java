import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int [] arr = {10, 9, 8, 11, 7, 12};
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        for(int i=arr.length-1;i>=0;i--){
            int temp = arr[i];
            if(stack.isEmpty()){
                stack.push(arr[i]);
                arr[i]=-1;
            }
            else{
                while(!stack.isEmpty()) {
//                    System.out.println("stack "+stack+" peek"+stack.peek() );
                    if (stack.peek() > arr[i]) {
                        arr[i] = stack.peek();
                        break;
                    } else {
                        stack.pop();
                        if(stack.isEmpty()){
                            arr[i]=-1;
                        }
                    }
                }
            }
            stack.push(temp);
        }
        System.out.println(Arrays.toString(arr));
    }
}