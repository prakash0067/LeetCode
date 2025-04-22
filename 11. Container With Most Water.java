class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        
        while (left < right) {
            // calculating area between 2 points
            int minHeight = Math.min(height[left],height[right]);
            int width = right - left;
            int area = minHeight * width;
            
            // if area is greater than our maxArea then make it new maxArea
            if (area > maxArea) {
                maxArea = area;
            }
            
            // now moving to next point 
            // if left side's height is smaller then move pointer from left side 
            if (height[left] < height[right]) {
                left++;
            } else {
                right--; // if right point is smaller than move point from right
            }
        }
        
        return maxArea;
    }
}