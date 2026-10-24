/*
You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == type i.
ruleKey == "color" and ruleValue == color i.
ruleKey == "name" and ruleValue == name i.
Return the number of items that match the given rule.

 

Example 1:

Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
Example 2:

Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
Output: 2
Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.
 

Constraints:

1 <= items.length <= 104
1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10
ruleKey is equal to either "type", "color", or "name".
All strings consist only of lowercase letters. */
// leetcode https://leetcode.com/problems/count-items-matching-a-rule/
/**
 * ItemsMatchingARule
 */
public class ItemsMatchingARule {

    public static void main(String[] args) {
String[][] arr={{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
String  ruleKey = "color"; // rulekey can be of type color or name so we will find index to itrate acc. to this.
String ruleValue = "silver";
int index =0;
int count =0;

if(ruleKey =="color"){
index=1;
}
if(ruleKey =="type"){
index=0;
}
if(ruleKey =="name"){
index=2;
}

for(int i =0; i<arr.length;i++){
    if(arr[i][index]==ruleValue){
        count++;
    }
}
System.out.println(count);
    }
}