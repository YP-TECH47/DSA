class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int target = 50;

        for (int i = 0; i < arr.length; i++) { // linear search 
            if (arr[i] == target) {
                System.out.printf("Element found at index " + i);
                break;
            }
        }
    }
}
