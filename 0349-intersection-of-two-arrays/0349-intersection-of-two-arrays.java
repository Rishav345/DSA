class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }

        Set<Integer> set = new HashSet<>();

        for (int num : nums2) {
            if (map.containsKey(num)) {
                set.add(num);
            }
        }
        int[] arr = set.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}