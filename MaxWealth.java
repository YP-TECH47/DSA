// import java.util.*;
/// leetcode :- to be inserted

public class MaxWealth {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 3, 2, 1 }, { 1, 2, 3, 1 } };
        int maxNum = 0;

        for (int i = 0; i < arr.length; i++) {
            int wealth = 0;
            for (int j = 0; j < arr[i].length; j++) {
                wealth += arr[i][j];
            }
            if (wealth > maxNum) {
                maxNum = wealth;
            }
        }
        System.out.println(maxNum);
    }
}
