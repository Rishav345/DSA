class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        int ans = 1;
        for (int i = 0; i <= rowIndex; i++) {
            if (i != 0 && i != rowIndex) {
                ans = (int) ((long) ans * (rowIndex - i + 1) / i);
                list.add(ans);
            } else {
                list.add(1);
            }
        }
        return list;
    }
}