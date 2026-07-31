class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        for(int i = 0, j = clean.length() -1; j>=i; i++, j--){
            if(clean.charAt(i)!= clean.charAt(j))
            return false;

        }
        return true;
    }
}
