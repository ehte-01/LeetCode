class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        int candidate = nums [0];
        int count = 1;

        int i = 1;
        while (i < nums.length) {
            
            if (nums[i] == candidate) {
                count ++ ;
            } else {
                count --;
            }
            if (count == 0){
                candidate = nums[i];
                count = 1;
            }
            i++;
        
        }

        count = 0;
        for (i = 0; i < nums.length; i++){
            if (candidate == nums[i]){
                count ++;
            }
        }

        if (count > n/2){
            return candidate;
        }
        return -1;

    }
}