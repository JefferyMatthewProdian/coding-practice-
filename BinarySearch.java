public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 7, 9};
        int target = 5;
        int i = 0;
        int j = arr.length-1;
        int mid = (i+j)/2;
        while (i<=j){
            mid = (i+j)/2;
            if (arr[mid]==target){
                System.out.println("Target found at index :"+mid);
                break;
            }
            else if(arr[mid]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }

    }
}