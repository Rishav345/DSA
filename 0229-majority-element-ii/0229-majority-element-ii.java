class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0;
        int cnt2 = 0;
        int elm1 = Integer.MIN_VALUE;
        int elm2 = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != elm2 && cnt1 == 0) {
                elm1 = nums[i];
                cnt1 = 1;
            } else if (nums[i] != elm1 && cnt2 == 0) {
                elm2 = nums[i];
                cnt2 = 1;
            } else if (elm1 == nums[i]) {
                cnt1++;
            } else if (elm2 == nums[i]) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0; cnt2 = 0; 
        for (int i = 0; i < n; i++) {
            if (nums[i] == elm1) cnt1++; 
            if (nums[i] == elm2) cnt2++;
        }

        if (cnt1 > n / 3 && cnt2 > n / 3) {
            return List.of(elm1, elm2);
        }
        if (cnt1 > n / 3) {
            return List.of(elm1);
        }
        if (cnt2 > n / 3) {
            return List.of(elm2);
        }

        return List.of();
    }
}