package leetcode;

public class SearchInsertPosition35 {
    public int searchInsert(int[] nums, int target) {
        // Brute Force
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }
}
