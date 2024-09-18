class Solution {
    public int maxArea(int[] height) {
        int w = 0, left = 0, right = height.length-1;
        while(left < right)
        {
            w = Math.max(w, Math.min(height[left], height[right]) * (right-left));
            if(height[left] > height[right]) right--;
            else left++;
            
        }
        return w;
        
    }
}