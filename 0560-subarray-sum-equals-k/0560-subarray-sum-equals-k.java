class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        int preSum = 0;
        int count = 0;
        m.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            int remove = preSum - k;
            if (m.containsKey(remove)) {
                count += m.get(remove);
            }
            m.put(preSum, m.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
}