class Solution {
    public int trap(int[] height) {
        int water = 0;
        boolean flat = true;
        int elevation = 0;

        for (int i = 0; i < height.length; i++) {
            if (height[i] == 0 && flat) {
                continue;
            } else {
                flat = false;
            }
            if (height[i] < elevation) {
                water += (elevation - height[i]); // 9
            } else {
                elevation = height[i];
            }
        }
        flat = true;
        int rightMax = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            if(height[i]== elevation)
            break;
            if (height[i] < elevation) {
                water -= (elevation - height[i]);
            } 
            if(height[i]>rightMax){
                rightMax = height[i];
            } else{
                water +=(rightMax-height[i]);
            }
        }
        return water;
    }
}
