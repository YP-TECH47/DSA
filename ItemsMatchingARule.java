/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
 

Constraints:

1 <= sentence.length <= 1000
sentence consists of lowercase English letters. */
// leetcode https://leetcode.com/problems/count-items-matching-a-rule/
/**
 * ItemsMatchingARule
 */
public class ItemsMatchingARule {

    public static void main(String[] args) {
        String sentence = "leetcode";
        int count = 0;
        boolean[] alpha = new boolean[26];
        if (sentence.length() != 26) {
            System.out.println(false);
        } else {
            for (int i = 0; i < sentence.length(); i++) {
                int exists = sentence.charAt(i) - 'a';

                if (!alpha[exists]) {
                    alpha[exists] = true;
                    count++;
                }

            }

            if (count == 26) {
                System.out.println(true);

            } else {
                System.out.println(false);

            }
        }

    }
}