/**
 * SwapArray
 */
public class SwapArray {

    public static void main(String[] args) {
        // swap array / reverse an array

        // two pointers approach 

        int arr[] = {1,2,3,4,5};
        int start = 0;
        int end = arr.length-1;

       while (start < end) {
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
       }

        for (int index = 0; index < arr.length; index++) {
            System.out.println(arr[index]);
        }
    }
}