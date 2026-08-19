import java.util.*;
public class ValidParanthese {
    public static void main(String[] args) {
        ArrayDeque<Character> stack = new ArrayDeque<Character>();
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        String str = "([)]";
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i)+" "+stack.peek()+" stack is: "+stack);
            if(!stack.isEmpty()  && map.containsKey(stack.peek()) && str.charAt(i)==map.get(stack.peek())){
                stack.pop();
            }
            else{
                stack.push(str.charAt(i));
            }
        }
        if(stack.isEmpty()){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}