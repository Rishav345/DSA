class Solution {
    public int longestConsecutive(int[] nums) {
        int maxi = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (Integer elm : set) {
            if (!set.contains(elm - 1)) {
                int count = 1;
                int x = elm;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    count++;
                }
                maxi = Math.max(maxi, count);
            }
        }

        return maxi;

    }
}