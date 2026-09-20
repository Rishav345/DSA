class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int i = s.length()-1;
        int cnt = 0;
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                break;
            } else {
                cnt++;
            }
            i--;
        }
        return cnt;
    }
}