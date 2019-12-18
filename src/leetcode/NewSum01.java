package leetcode;

import java.util.*;

// Try to optimize
public class NewSum01 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (j != i && nums[i] + nums[j] == target) {
                        int[] output = {i, j};
                        return output;
                    }
                }
            }
            return null;
        }
    }
}
