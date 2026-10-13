class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<>();

        if (nums.length != 0) {
            int count = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (i == nums.length - 1) {
                    if (count != nums[i]) {
                        list.add(String.valueOf(count) + "->" + String.valueOf(nums[i]));

                    } else {
                        list.add(String.valueOf(count));
                    }
                } else {
                    if (nums[i] + 1 == nums[i + 1]) {
                        continue;
                    } else {
                        if (count != nums[i]) {
                            list.add(String.valueOf(count) + "->" + String.valueOf(nums[i]));

                        } else {
                            list.add(String.valueOf(count));
                        }
                        count = nums[i + 1];
                    }
                }
            }
        }

        return list;
    }
}