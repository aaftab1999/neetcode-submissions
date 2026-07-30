class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max =1, streak =1;
        
        for(int i=1; i< nums.length; i++){
            if(nums[i-1] == nums[i])
            continue;
            if(nums[i] == (nums[i-1]+1)) {
                streak++;
                if(streak > max){
                    max = streak;
                }
            }
            else
            streak=1;

        }
        return nums.length > 0 ? max : 0;
    }
}
