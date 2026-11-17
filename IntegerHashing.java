class IntegerHashing {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 4 };
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int hashArray[] = new int[13];
        int[] res = new int[nums.length];

        for (int i = 0; i < arr.length; i++) {
            hashArray[arr[i]] += 1; // precomputation in the hashArray
        }

        for (int i = 0; i < nums.length; i++) {

            res[i] = hashArray[nums[i]];

        }

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
