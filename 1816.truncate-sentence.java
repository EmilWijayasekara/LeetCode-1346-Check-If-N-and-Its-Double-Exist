/*
 * @lc app=leetcode id=1816 lang=java
 *
 * [1816] Truncate Sentence
 */

// @lc code=start
class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        String truncatedSentence = "";
        for (int i = 0; i < k; i++) truncatedSentence += " " + words[i];
        return truncatedSentence.trim();
    }
}
//https://github.com/EmilWijayasekara
// @lc code=end

