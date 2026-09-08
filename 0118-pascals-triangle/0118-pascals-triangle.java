class Solution {

    static List<Integer> formula(int row, int k) {
        List<Integer> temp = new ArrayList<>();
        int ans = 1;
        for (int i = 0; i <= row; i++) {
            if (i != 0 && i != row) {
                ans = ans * ((row + 1) - i) / i;
                temp.add(ans);
            } else {
                temp.add(1);
            }
        }
        return temp;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ls = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> ans = formula(i, numRows);
            ls.add(ans);
        }
        return ls;

    }
}