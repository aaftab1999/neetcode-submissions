class Solution {
    public int maxArea(int[] heights) {

        int length = heights.length-1, max =0;
        for(int i = 0, j = heights.length -1; i< j;) {
           int h = Math.min(heights[i], heights[j]);
           max = max<(h*length) ? h*length: max;
           if(heights[i]<=heights[j]){
            i++; length--;
           } else{
            j--; length--;
           }
        }
        return max;
    }
}
