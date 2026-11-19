import java.util.Arrays;

class MergeSort {
    public static void Merge_Sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        Merge_Sort(arr, low, mid);
        Merge_Sort(arr, mid + 1, high);
        Merge(arr, low, mid, high);

    }

    public static void Merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;

        // Compare elements from both halves
        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                temp[k] = arr[left];
                left++;
            } else {
                temp[k] = arr[right];
                right++;
            }

            k++;
        }

        // Copy remaining elements from left half
        while (left <= mid) {
            temp[k] = arr[left];
            left++;
            k++;
        }

        // Copy remaining elements from right half
        while (right <= high) {
            temp[k] = arr[right];
            right++;
            k++;
        }

        // Copy sorted elements back into original array
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };

        Merge_Sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
