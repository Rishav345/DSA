class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0)
                pos.add(nums[i]); 
            else
                neg.add(nums[i]); 
        }

        for (int i = 0; i < n / 2; i++) {
            A[2 * i] = pos.get(i);       
            A[2 * i + 1] = neg.get(i);   
        }

        return A;
    }
}