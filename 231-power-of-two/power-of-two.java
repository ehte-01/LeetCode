class Solution {
    public boolean isPowerOfTwo(int n) {
        return helper(n, 0);
    }
    private static boolean helper(int n,int x){

        if(n<1){
            return false;
        }

        while(x<=31){
            if(n==(Math.pow(2,x))){
                return true;
            }
            x++;
        }
        return false;
    }
}