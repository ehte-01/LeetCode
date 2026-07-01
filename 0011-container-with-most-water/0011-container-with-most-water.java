class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int currArea=1;
        int maxmArea=0;

        while(left<right){
            
            currArea=(right-left)*Math.min(height[left],height[right]);

            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }
            maxmArea=Math.max(currArea,maxmArea);
           
        }
        
        return maxmArea;
    }
}