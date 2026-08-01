class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> index = new HashMap<>();
        int left =0, max = 0;
        for(int i=0; i< s.length(); i++){
            char c = s.charAt(i);
            if(index.containsKey(c)){
                left = Math.max(index.get(c)+1, left);
            } 
            index.put(c, i);
            max = Math.max(max, i-left+1);
           
        
        }
        return max;
        
    }
}
