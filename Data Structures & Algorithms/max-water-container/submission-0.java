class Solution {
    public int maxArea(int[] heights) {
        int low=0;
        int high = heights.length -1 ;
        int maxArea=0,area;
        while(low < high)
        { 
          area = (high - low)* Math.min(heights[high], heights[low]);
          maxArea = Math.max(maxArea, area);
          if(heights[high] > heights[low]) low++;
          else high--;

        }
        return maxArea;
    }
}
