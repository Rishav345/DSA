class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean isTrue = false;
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() > 1) {
                isTrue = true;
                break;
            }
        }

        return isTrue;
    }
}