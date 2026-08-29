class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int prev = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                prev = Math.max(count, prev);
                count = 0;
            }
        }
        if (count > prev) {
            return count;
        } else {
            return prev;
        }
    }
}