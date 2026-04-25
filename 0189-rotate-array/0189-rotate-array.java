// O(n) time, O(1) space — Reverse Trick
// 3 reverses = right rotation by k
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // handle k > n
        if (k == 0) return;

        reverse(nums, 0, n - 1);    // Step 1: reverse whole
        reverse(nums, 0, k - 1);    // Step 2: reverse first k
        reverse(nums, k, n - 1);    // Step 3: reverse rest
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int tmp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = tmp;
        }
    }
}