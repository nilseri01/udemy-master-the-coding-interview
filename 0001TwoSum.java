// https://leetcode.com/problems/two-sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diffIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (diffIndexMap.containsKey(diff)) {
                return new int[] { diffIndexMap.get(diff), i };
            }
            diffIndexMap.put(nums[i], i);
        }
        return new int[] {};
    }
}
