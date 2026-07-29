class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] left = new int[n];
        int mul = 1;
        for(int i = 0; i< n; i++) {
            left[i] =mul;
            mul*=nums[i];
        }       
        int[] right = new int[n];
        mul=1;
        for(int i= n -1; i>=0; i--) {
            right[i]=mul;
            mul*=nums[i];

        }

        int[] result = new int[n];
        for(int i=0; i< n; i++){
            result[i] = left[i]*right[i];
        }
        return result;



    }
}  
