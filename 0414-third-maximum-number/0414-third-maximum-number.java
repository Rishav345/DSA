class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        int count = 0;
        int max = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (count == 0 || nums[i] != max) {
                count++;
                max = nums[i];

                if (count == 3) {
                    return max;
                }
            }
        }

        return nums[nums.length - 1];
    }
}