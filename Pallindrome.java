
//   "//s+" is regex /s => white space    + means more than once
public class Palindrome {
    public static void main(String[] args) {

        String str = "A man a plan a canal Panama";

        int left = 0;
        int right = str.length() - 1;

        boolean flag = true;

        while (left < right) {

            // Skip non-alphanumeric characters from left
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }

            // Skip non-alphanumeric characters from right
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            // Compare characters
            if (Character.toLowerCase(str.charAt(left))
                    != Character.toLowerCase(str.charAt(right))) {

                flag = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println(flag);
    }
}