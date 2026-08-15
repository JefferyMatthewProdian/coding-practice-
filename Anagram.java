import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        Boolean flag = true;
        HashMap<Character,Integer> map1 = new HashMap();
        HashMap<Character,Integer> map2 = new HashMap();
        if (str1.length() != str2.length()) {
            System.out.println(false);
        }
        else {
            for (int i = 0; i < str1.length(); i++) {
                map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
                map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0) + 1);
            }
            for (int i = 0; i < str1.length(); i++) {
                Character ch = str1.charAt(i);
                if (map2.containsKey(ch) && map1.get(ch) == map2.get(ch)) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag);
        }

    }
}