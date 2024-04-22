public class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int pos = 0; // Position to place the next non-zero element

        // First pass: Move non-zero elements to the front, preserving order
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i]; // Move non-zero element to 'pos'
                pos++; // Increment the position
            }
        }

        // Second pass: Fill in zeros from 'pos' to the end of the array
        while (pos < n) {
            nums[pos] = 0;
            pos++;
        }
    }
}
