/*
 * @lc app=leetcode id=2011 lang=java
 *
 * [2011] Final Value of Variable After Performing Operations
 */

// @lc code=start
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int xValue = 0;
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].equals("--X")) --xValue;
            if(operations[i].equals("X++")) xValue++;
            if(operations[i].equals("X--")) xValue--;
            if(operations[i].equals("++X")) ++xValue;
        }
        return xValue;
    }
}
// @lc code=end

