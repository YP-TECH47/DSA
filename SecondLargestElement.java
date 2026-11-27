/**
 * SecondLargestElement
 */
class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int largest = arr[0];
        int second_Largest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                second_Largest = largest;
                largest = arr[i];
            }
        }

        System.out.println(second_Largest);
    }
}