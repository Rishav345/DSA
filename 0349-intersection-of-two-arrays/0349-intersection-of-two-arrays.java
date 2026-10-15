class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        List<Integer> list = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else {
                if (!list.contains(nums2[j])) {
                    list.add(nums2[j]);
                }
                i++;
                j++;
            }
        }

        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();

        return arr;
    }
}