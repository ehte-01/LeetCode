class Solution {
    public int singleNumber(int[] nums) {
        
        int out = 0;
        int len = nums.length;

        for(int i = 0 ; i < len; i++){
            
            out = out ^ nums[i];
        }

        return out;
    }
}