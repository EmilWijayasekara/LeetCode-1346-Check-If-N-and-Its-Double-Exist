/*
 * @lc app=leetcode id=1346 lang=java
 *
 * [1346] Check If N and Its Double Exist
 */

// @lc code=start
class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if((arr[i]*2 == arr[j]) && i!=j){
                    return true;
                }
            }
        }
        return false;
    }
}
// @lc code=end