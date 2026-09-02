class Solution {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public void nextPermutation(int[] nums) {
        int bp = -1;
        int n = nums.length;
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                bp = i - 1;
                break;
            }
        }

        for (int i = n - 1; i > bp; i--) {
            if (bp < 0) {
                reverse(nums, n - 1, 0);
                break;
            }
            if (nums[bp] < nums[i]) {
                swap(nums, bp, i);
                break;
            }
        }

        reverse(nums, bp + 1, n - 1);

    }
}