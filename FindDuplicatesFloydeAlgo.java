//Floyd's algorithm ( find the cycle )
// turn array to linked list to find the pointers that point to the same element hence find the duplicates


public class FindDuplicatesFloydeAlgo{
    public static void main(String[] args) {
        int [] arr = {2, 2, 2, 2, 2};
        int slow = arr[0];
        int fast = arr[arr[0]];
        while (slow!=fast){
            slow = arr[slow];
            fast = arr[arr[fast]];
        }
        System.out.println(arr[slow]);
    }
}