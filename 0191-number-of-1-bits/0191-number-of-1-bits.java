public class Solution {
    public int hammingWeight(int n) {

        int count = 0;

        while (n != 0) {

            if ((n & 1) == 1) { // last bit check
                count++;
            }

            n = n >>> 1; // right shift
        }

        return count;
    }
}