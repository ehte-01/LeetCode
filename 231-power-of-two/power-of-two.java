class Solution {
    public boolean isPowerOfTwo(int n) {
         if(n<1){
            return false;
        }
        return helper(n);
    }
    private static boolean helper(int n){
        if(n==1) return true;
        if(n%2!=0)return false;
        return helper(n/2);
    }
}