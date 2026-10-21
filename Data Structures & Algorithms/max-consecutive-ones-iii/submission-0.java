class Solution {
    public int longestOnes(int[] nums, int k) {
        int s=0, e=0, max =0, cnt0 =0;
        while(e<nums.length){
            if(nums[e]==0){
                cnt0++;
            }
            while(cnt0>k && s<=e){
                if(nums[s]==0){
                    cnt0--;
                }
                s++;
            }
            max = Math.max(max, e-s+1);
            e++;
        }
        return max;
        
    }
}