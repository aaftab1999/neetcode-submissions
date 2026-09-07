class Solution {
    int[] memo;
    public int numDecodings(String s) {
        memo = new int[s.length()];
        Arrays.fill(memo, -1);
        return dfs(0, s);
    }
    private int dfs(int i, String s) {
        if(i==s.length()) return 1;
        if(s.charAt(i) == '0') return 0;
        if(memo[i] != -1) return memo[i];

        int res = dfs(i+1, s);
        if(i<s.length() -1){
            if(s.charAt(i) == '1' || (s.charAt(i) == '2' && s.charAt(i+1) < '7')){
                res += dfs(i+2, s);
            }
        }
        return memo[i] = res;
    }
}
