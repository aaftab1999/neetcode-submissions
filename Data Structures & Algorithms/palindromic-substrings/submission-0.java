class Solution {
    public int countSubstrings(String s) {
        int counter = s.length();
        for (int i = 0; i < s.length(); i++) {
            int l = i - 1, r = i + 1;
            while (l >= 0 && r < s.length()) {
                if (s.charAt(l) == s.charAt(r)) {
                    counter++;
                    l--;
                    r++;
                } else
                    break;
            }
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length()) {
                if (s.charAt(l) == s.charAt(r)) {
                    counter++;
                    l--;
                    r++;
                } else
                    break;
            }
        }
        return counter;
    }
}
