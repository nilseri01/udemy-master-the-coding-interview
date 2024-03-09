// https://leetcode.com/problems/longest-substring-without-repeating-characters
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        int[] count = new int[128];

        int index1 = 0, index2 = 0;
        while (index2 < s.length()) {
            count[s.charAt(index2)]++;
            while (count[s.charAt(index2)] > 1) {
                count[s.charAt(index1)]--;
                index1++;
            }
                
            answer = Math.max(answer, index2 - index1 + 1);
            index2++;
        }

        return answer;
    }
}
