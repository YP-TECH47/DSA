/**
 * CheckEvenDigits
 */

/// leetcode
/// :- https://leetcode.com/problems/find-numbers-with-even-number-of-digits
public class CheckEvenDigits {

    public static void main(String[] args) {
        int arr[] = { 555, 901, 482, 1771 };
        int evnDigits = 0;
        // in this array check that is there any even no. of digits in a number if yes
        // return their indexes or just return true.

        for (int element : arr) {
            if (even(element)) {
                evnDigits++;
            }
        }
        System.out.println(evnDigits);

    }

    static boolean even(int num) {
        int count = 0;
        while (num > 0) {

            count++;
            num = num / 10;

        }
        return count % 2 == 0;
    }
}