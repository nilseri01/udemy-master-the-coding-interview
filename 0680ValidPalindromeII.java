// https://leetcode.com/problems/valid-palindrome-ii
class Solution {
    public boolean validPalindrome(String s) {
        int leftIndex = 0;
        int rightIndex = s.length() - 1;
        while (leftIndex < rightIndex) {
            if (s.charAt(leftIndex) != s.charAt(rightIndex)) {
                return validPalindrome(s, leftIndex + 1, rightIndex) || validPalindrome(s, leftIndex, rightIndex - 1);
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }

    private boolean validPalindrome(String s, int leftIndex, int rightIndex) {
        while (leftIndex < rightIndex) {
            if (s.charAt(leftIndex) != s.charAt(rightIndex)) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}
