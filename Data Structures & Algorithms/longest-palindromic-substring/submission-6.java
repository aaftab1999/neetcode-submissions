class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1)
            return s;
        if(s.length()==2){
            return s.charAt(0)==s.charAt(1) ? s: s.substring(0, 1);
        }    
        int l = 0, r = 0, resLen = 1, sI = 0, eI = 0;
        for (int i = 0; i < s.length(); i++) {
            l = i;
            r = i;
            int length = 0;
            while (l >= 0 && r < s.length()) {
                if (s.charAt(l) == s.charAt(r)) {
                    length = r-l+1;
                    l--;
                    r++;
                } else {
                    break;
                }
            }


            if (resLen < length) {
                resLen = length;
                sI = l++;
                eI = r;
            }


            l=i; r=i+1;
            while (l >= 0 && r < s.length()) {
                if (s.charAt(l) == s.charAt(r)) {
                    length = r-l+1;
                    l--;
                    r++;
                } else {
                    break;
                }
            }
            



            if (resLen < length) {
                resLen = length;
                sI = l++;
                eI = r;
            }
        }
        return s.substring(++sI, eI);
    }
}
