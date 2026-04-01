class Solution {
    public int findComplement(int num) {
        int mask = 0;
        int temp = num;
        
        // mask banana (same bit length)
        while (temp > 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }
        
        return num ^ mask;
    }
}