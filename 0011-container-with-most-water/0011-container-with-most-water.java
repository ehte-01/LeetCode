class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxVol = 0;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxVol = Math.max(maxVol, area);

            if (height[left] <= height[right]) left++;
            else right--;
        }
        return maxVol;
    }
}