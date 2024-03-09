// https://leetcode.com/problems/backspace-string-compare
class Solution {
    public boolean backspaceCompare(String s, String t) {
        int indexS = s.length() - 1;
        int indexT = t.length() - 1;

        while (true) {
            int backspace = 0;
            while (indexS >= 0 && (s.charAt(indexS) == '#' || backspace > 0)) {
                backspace += (s.charAt(indexS) == '#' ? 1 : -1);
                indexS--;
            }

            backspace = 0;
            while (indexT >= 0 && (t.charAt(indexT) == '#' || backspace > 0)) {
                backspace += (t.charAt(indexT) == '#' ? 1 : -1);
                indexT--;
            }
            
            if (indexS >= 0 && indexT >= 0 && s.charAt(indexS) == t.charAt(indexT)) {
                indexS--;
                indexT--;
            } else {
                break;
            }
        }

        return indexS == -1 && indexT == -1;
    }
}
