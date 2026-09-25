class Solution {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void rev(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public void nextPermutation(int[] nums) {
        int Bp = -1;
        int n = nums.length;
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                Bp = i - 1;
                break;
            }
        }

        for (int i = n - 1; i > Bp; i--) {
            if (Bp < 0) {
                rev(nums, n - 1, 0);
                break;
            }
            if (nums[Bp] < nums[i]) {
                swap(nums, Bp, i);
                break;
            }
        }

        rev(nums, Bp + 1, n - 1);

    }
}