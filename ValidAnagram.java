/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input:
String s = "anagram";
String t = "nagaram";


Output: true

Example 2:

Input:
String s = "rat";
String t = "car";


Output: false

 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
  */
// https://leetcode.com/problems/valid-anagram

/**
 * ValidAnagram
 */
public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        int[] count = new int[26];
        boolean temp = true; // for console purpose

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int element : count) {
            if (element != 0) {
                temp = false;
                break;
            }
        }
        System.out.println(temp);

    }
}