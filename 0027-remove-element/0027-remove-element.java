class Solution {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length -1;
        int count = 0;
        while (i <= j){
            if(nums[i] == val && nums[j] != val){
                swap(nums,i,j);
                i++;
                j--;
                count++;
            }else if(nums[i] == val && nums[j] == val){
                j--;
                count++;
            }else if(nums[i] != val && nums[j]!=val){
                i++;
            }else{
                i++;
                j--;
                count++;
            }
        }
        return  nums.length - count;
    }

}