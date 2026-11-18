import java.util.Arrays;

public class BubbleSortMain {
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        boolean swapped;

        // Bubble Sort logic directly inside main
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the current element is greater than the next
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // Stop early if no swaps happened during this pass for best case TC
            if (!swapped) {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
